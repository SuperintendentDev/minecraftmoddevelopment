package net.mcreator.athenamod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class FireAttackWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.FLAME, x, y, z, 0, 0, 1);
		world.addParticle(ParticleTypes.FLAME, x, y, z, 0, 0, 1);
		world.addParticle(ParticleTypes.FLAME, x, y, z, 0, 0, 1);
		world.addParticle(ParticleTypes.FLAME, x, y, z, 0, 0, 1);
		world.addParticle(ParticleTypes.FLAME, x, y, z, 0, 0, 1);
		world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, 0, 0, 1);
		world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, 0, 0, 1);
		world.addParticle(ParticleTypes.SMALL_FLAME, x, y, z, 0, 0, 1);
		world.addParticle(ParticleTypes.SMALL_FLAME, x, y, z, 0, 0, 1);
		world.addParticle(ParticleTypes.SMALL_FLAME, x, y, z, 0, 0, 1);
		world.addParticle(ParticleTypes.SMALL_FLAME, x, y, z, 0, 0, 1);
	}
}
