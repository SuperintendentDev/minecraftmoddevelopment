
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.athenamod.client.particle.ExplosionParticle;
import net.mcreator.athenamod.client.particle.CrossesParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AthenaModModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(AthenaModModParticleTypes.EXPLOSION.get(), ExplosionParticle::provider);
		event.registerSpriteSet(AthenaModModParticleTypes.CROSSES.get(), CrossesParticle::provider);
	}
}
