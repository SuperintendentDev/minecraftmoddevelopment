
package net.mcreator.athenamod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.athenamod.entity.Civilian2Entity;

public class Civilian2Renderer extends HumanoidMobRenderer<Civilian2Entity, HumanoidModel<Civilian2Entity>> {
	public Civilian2Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new EyesLayer<Civilian2Entity, HumanoidModel<Civilian2Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("athena_mod:textures/entities/nothing.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Civilian2Entity entity) {
		return new ResourceLocation("athena_mod:textures/entities/2023_09_02_civilian-2-21946912.png");
	}
}
