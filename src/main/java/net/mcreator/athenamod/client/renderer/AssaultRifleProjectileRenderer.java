package net.mcreator.athenamod.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.athenamod.entity.AssaultRifleProjectileEntity;
import net.mcreator.athenamod.client.model.ModelBullet;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AssaultRifleProjectileRenderer extends EntityRenderer<AssaultRifleProjectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("athena_mod:textures/entities/bulletmodeltexture.png");
	private final ModelBullet model;

	public AssaultRifleProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelBullet(context.bakeLayer(ModelBullet.LAYER_LOCATION));
	}

	@Override
	public void render(AssaultRifleProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(AssaultRifleProjectileEntity entity) {
		return texture;
	}
}
