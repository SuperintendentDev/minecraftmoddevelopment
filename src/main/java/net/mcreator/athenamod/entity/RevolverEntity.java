
package net.mcreator.athenamod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.athenamod.init.AthenaModModItems;
import net.mcreator.athenamod.init.AthenaModModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class RevolverEntity extends AbstractArrow implements ItemSupplier {
	public RevolverEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(AthenaModModEntities.REVOLVER.get(), world);
	}

	public RevolverEntity(EntityType<? extends RevolverEntity> type, Level world) {
		super(type, world);
	}

	public RevolverEntity(EntityType<? extends RevolverEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public RevolverEntity(EntityType<? extends RevolverEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(AthenaModModItems.NOTHING.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(AthenaModModItems.BULLET.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static RevolverEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		RevolverEntity entityarrow = new RevolverEntity(AthenaModModEntities.REVOLVER.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:revolver")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static RevolverEntity shoot(LivingEntity entity, LivingEntity target) {
		RevolverEntity entityarrow = new RevolverEntity(AthenaModModEntities.REVOLVER.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 3.5f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0.8);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:revolver")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
