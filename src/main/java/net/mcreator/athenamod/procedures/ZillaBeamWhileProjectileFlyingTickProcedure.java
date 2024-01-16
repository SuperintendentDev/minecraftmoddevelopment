package net.mcreator.athenamod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.athenamod.init.AthenaModModParticleTypes;

public class ZillaBeamWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (AthenaModModParticleTypes.EXPLOSION.get()), x, y, z, 0, 0, 1);
		world.addParticle((SimpleParticleType) (AthenaModModParticleTypes.EXPLOSION.get()), x, y, z, 0, 0, 2);
		world.addParticle((SimpleParticleType) (AthenaModModParticleTypes.EXPLOSION.get()), x, y, z, 0, 0, 3);
	}
}
