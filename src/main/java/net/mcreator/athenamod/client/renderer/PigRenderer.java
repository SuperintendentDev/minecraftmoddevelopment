
package net.mcreator.athenamod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.athenamod.entity.PigEntity;

public class PigRenderer extends MobRenderer<PigEntity, PigModel<PigEntity>> {
	public PigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PigEntity entity) {
		return new ResourceLocation("athena_mod:textures/entities/pig_old_minecraft.png");
	}
}
