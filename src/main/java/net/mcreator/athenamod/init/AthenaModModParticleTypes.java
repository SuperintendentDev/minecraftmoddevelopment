
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.athenamod.AthenaModMod;

public class AthenaModModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AthenaModMod.MODID);
	public static final RegistryObject<SimpleParticleType> EXPLOSION = REGISTRY.register("explosion", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> CROSSES = REGISTRY.register("crosses", () -> new SimpleParticleType(true));
}
