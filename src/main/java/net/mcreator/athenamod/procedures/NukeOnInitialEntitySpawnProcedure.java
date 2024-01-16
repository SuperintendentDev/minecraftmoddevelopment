package net.mcreator.athenamod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.athenamod.entity.NukeEntity;
import net.mcreator.athenamod.AthenaModMod;

public class NukeOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof NukeEntity) {
			((NukeEntity) entity).setAnimation("explode");
		}
		AthenaModMod.queueServerWork(100, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
