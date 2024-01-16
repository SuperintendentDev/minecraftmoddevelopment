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

public class ShearedsheepOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double yaw = 0;
		AthenaModMod.queueServerWork((int) Mth.nextDouble(RandomSource.create(), 600, 2000), () -> {
			if (entity.isAlive()) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = AthenaModModEntities.WOOLYSHEEP.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		});
	}
}
