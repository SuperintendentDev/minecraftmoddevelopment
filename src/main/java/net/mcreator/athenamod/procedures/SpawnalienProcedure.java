package net.mcreator.athenamod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.athenamod.init.AthenaModModEntities;
import net.mcreator.athenamod.AthenaModMod;

public class SpawnalienProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		AthenaModMod.queueServerWork(100, () -> {
			if (entity.isAlive()) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AthenaModModEntities.ALIEN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		});
	}
}
