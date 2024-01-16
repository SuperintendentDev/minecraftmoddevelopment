package net.mcreator.athenamod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.athenamod.entity.KeyMasterEntity;

public class KeyMasterModel extends GeoModel<KeyMasterEntity> {
	@Override
	public ResourceLocation getAnimationResource(KeyMasterEntity entity) {
		return new ResourceLocation("athena_mod", "animations/keymaster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KeyMasterEntity entity) {
		return new ResourceLocation("athena_mod", "geo/keymaster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KeyMasterEntity entity) {
		return new ResourceLocation("athena_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
