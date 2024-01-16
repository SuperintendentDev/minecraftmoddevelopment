
package net.mcreator.athenamod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.athenamod.entity.LancePetersonEntity;
import net.mcreator.athenamod.client.model.ModelLance;

public class LancePetersonRenderer extends MobRenderer<LancePetersonEntity, ModelLance<LancePetersonEntity>> {
	public LancePetersonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelLance(context.bakeLayer(ModelLance.LAYER_LOCATION)), 0.8f);
		this.addLayer(new EyesLayer<LancePetersonEntity, ModelLance<LancePetersonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("athena_mod:textures/entities/nothing.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LancePetersonEntity entity) {
		return new ResourceLocation("athena_mod:textures/entities/lance.png");
	}
}
