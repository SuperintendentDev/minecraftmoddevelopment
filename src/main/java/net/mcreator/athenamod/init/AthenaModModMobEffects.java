
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.athenamod.potion.MoonGravityMobEffect;
import net.mcreator.athenamod.AthenaModMod;

public class AthenaModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AthenaModMod.MODID);
	public static final RegistryObject<MobEffect> MOON_GRAVITY = REGISTRY.register("moon_gravity", () -> new MoonGravityMobEffect());
}
