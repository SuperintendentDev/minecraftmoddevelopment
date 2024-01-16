package net.mcreator.athenamod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class RocketLauncherWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, 0, 0, 1);
		world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, 0, 0, 1);
		world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 0, 1);
	}
}
