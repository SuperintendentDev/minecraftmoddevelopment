package net.mcreator.athenamod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.athenamod.init.AthenaModModEntities;
import net.mcreator.athenamod.AthenaModMod;

public class DinosaurEggBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		AthenaModMod.queueServerWork(10000, () -> {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (Mth.nextDouble(RandomSource.create(), 1, 10) <= 5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AthenaModModEntities.RAPTOR.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			} else {
				if (Mth.nextDouble(RandomSource.create(), 1, 10) <= 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AthenaModModEntities.BRONTOSAURUS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AthenaModModEntities.TYRANNOSAURUS_REX.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			}
		});
	}
}
