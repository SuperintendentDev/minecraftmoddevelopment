package net.mcreator.athenamod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.athenamod.entity.UfoEntity;

public class UfoModel extends GeoModel<UfoEntity> {
	@Override
	public ResourceLocation getAnimationResource(UfoEntity entity) {
		return new ResourceLocation("athena_mod", "animations/ufo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UfoEntity entity) {
		return new ResourceLocation("athena_mod", "geo/ufo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UfoEntity entity) {
		return new ResourceLocation("athena_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
