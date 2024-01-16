package net.mcreator.athenamod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.athenamod.init.AthenaModModEntities;

public class PowerCrystalBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextDouble(RandomSource.create(), 1, 10) <= 5) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = AthenaModModEntities.ROCK_MONSTER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}
