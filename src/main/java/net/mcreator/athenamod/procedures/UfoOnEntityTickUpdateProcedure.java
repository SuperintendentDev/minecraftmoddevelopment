package net.mcreator.athenamod.procedures;

import net.minecraft.world.entity.Entity;

public class UfoOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getY() <= 40) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
