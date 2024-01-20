
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.athenamod.client.model.Modelrocket;
import net.mcreator.athenamod.client.model.ModelLance;
import net.mcreator.athenamod.client.model.ModelCustomModel;
import net.mcreator.athenamod.client.model.ModelBullet;
import net.mcreator.athenamod.client.model.ModelApollo;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AthenaModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelLance.LAYER_LOCATION, ModelLance::createBodyLayer);
		event.registerLayerDefinition(Modelrocket.LAYER_LOCATION, Modelrocket::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(ModelBullet.LAYER_LOCATION, ModelBullet::createBodyLayer);
		event.registerLayerDefinition(ModelApollo.LAYER_LOCATION, ModelApollo::createBodyLayer);
	}
}
