package net.mcreator.athenamod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.athenamod.entity.SpeedsterEntity;

public class SpeedsterModel extends GeoModel<SpeedsterEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpeedsterEntity entity) {
		return new ResourceLocation("athena_mod", "animations/speedster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpeedsterEntity entity) {
		return new ResourceLocation("athena_mod", "geo/speedster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpeedsterEntity entity) {
		return new ResourceLocation("athena_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
