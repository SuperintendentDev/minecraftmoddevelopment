package net.mcreator.athenamod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.athenamod.entity.CricketEntity;

public class CricketModel extends GeoModel<CricketEntity> {
	@Override
	public ResourceLocation getAnimationResource(CricketEntity entity) {
		return new ResourceLocation("athena_mod", "animations/cricket.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CricketEntity entity) {
		return new ResourceLocation("athena_mod", "geo/cricket.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CricketEntity entity) {
		return new ResourceLocation("athena_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
