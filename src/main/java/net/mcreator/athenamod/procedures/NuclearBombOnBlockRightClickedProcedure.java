package net.mcreator.athenamod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.athenamod.init.AthenaModModEntities;
import net.mcreator.athenamod.AthenaModMod;

import java.util.List;
import java.util.Comparator;

public class NuclearBombOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Nuclear Bomb Armed, 15 seconds till detonation"), false);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:nukesiren")), SoundSource.NEUTRAL, 10, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:nukesiren")), SoundSource.NEUTRAL, 10, 1, false);
			}
		}
		AthenaModMod.queueServerWork(300, () -> {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:nuke")), SoundSource.NEUTRAL, 5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:nuke")), SoundSource.NEUTRAL, 5, 1, false);
				}
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 100, Level.ExplosionInteraction.TNT);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = AthenaModModEntities.NUKE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
							@Override
							public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
								String _translatekey = "death.attack." + "Nuke";
								if (this.getEntity() == null && this.getDirectEntity() == null) {
									return _msgEntity.getKillCredit() != null
											? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName());
								} else {
									Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
									ItemStack _itemstack = ItemStack.EMPTY;
									if (this.getEntity() instanceof LivingEntity _livingentity)
										_itemstack = _livingentity.getMainHandItem();
									return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
											? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
								}
							}
						}, 500);
				}
			}
		});
	}
}
