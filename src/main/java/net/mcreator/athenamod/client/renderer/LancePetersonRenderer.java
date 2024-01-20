
package net.mcreator.athenamod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.athenamod.entity.LancePetersonEntity;
import net.mcreator.athenamod.client.model.ModelLance;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LancePetersonRenderer extends MobRenderer<LancePetersonEntity, ModelLance<LancePetersonEntity>> {
	public LancePetersonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelLance(context.bakeLayer(ModelLance.LAYER_LOCATION)), 0.8f);
		this.addLayer(new RenderLayer<LancePetersonEntity, ModelLance<LancePetersonEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("athena_mod:textures/entities/nothing.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LancePetersonEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LancePetersonEntity entity) {
		return new ResourceLocation("athena_mod:textures/entities/lance.png");
	}
}
