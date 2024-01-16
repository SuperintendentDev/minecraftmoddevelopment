
package net.mcreator.athenamod.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.athenamod.procedures.ZillaBeamWhileProjectileFlyingTickProcedure;
import net.mcreator.athenamod.procedures.RocketLauncherProjectileHitsBlockProcedure;
import net.mcreator.athenamod.init.AthenaModModItems;
import net.mcreator.athenamod.init.AthenaModModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ZillaBeamEntity extends AbstractArrow implements ItemSupplier {
	public ZillaBeamEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(AthenaModModEntities.ZILLA_BEAM.get(), world);
	}

	public ZillaBeamEntity(EntityType<? extends ZillaBeamEntity> type, Level world) {
		super(type, world);
	}

	public ZillaBeamEntity(EntityType<? extends ZillaBeamEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ZillaBeamEntity(EntityType<? extends ZillaBeamEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(AthenaModModItems.RAYGUN.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		RocketLauncherProjectileHitsBlockProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		RocketLauncherProjectileHitsBlockProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		RocketLauncherProjectileHitsBlockProcedure.execute(this.level(), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		ZillaBeamWhileProjectileFlyingTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
		if (this.inGround)
			this.discard();
	}

	public static ZillaBeamEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		ZillaBeamEntity entityarrow = new ZillaBeamEntity(AthenaModModEntities.ZILLA_BEAM.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static ZillaBeamEntity shoot(LivingEntity entity, LivingEntity target) {
		ZillaBeamEntity entityarrow = new ZillaBeamEntity(AthenaModModEntities.ZILLA_BEAM.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 8f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(10);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
