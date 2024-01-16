package net.mcreator.athenamod.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.athenamod.entity.WizardEntity;

public class WizardModel extends GeoModel<WizardEntity> {
	@Override
	public ResourceLocation getAnimationResource(WizardEntity entity) {
		return new ResourceLocation("athena_mod", "animations/wizard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WizardEntity entity) {
		return new ResourceLocation("athena_mod", "geo/wizard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WizardEntity entity) {
		return new ResourceLocation("athena_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(WizardEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			int unpausedMultiplier = !Minecraft.getInstance().isPaused() ? 1 : 0;
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * ((float) Math.PI / 180F) * unpausedMultiplier);
			head.setRotY(entityData.netHeadYaw() * ((float) Math.PI / 180F) * unpausedMultiplier);
		}

	}
}
