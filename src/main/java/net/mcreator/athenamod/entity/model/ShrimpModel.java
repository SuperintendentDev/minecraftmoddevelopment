package net.mcreator.athenamod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.athenamod.entity.ShrimpEntity;

public class ShrimpModel extends GeoModel<ShrimpEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShrimpEntity entity) {
		return new ResourceLocation("athena_mod", "animations/shrimp.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShrimpEntity entity) {
		return new ResourceLocation("athena_mod", "geo/shrimp.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShrimpEntity entity) {
		return new ResourceLocation("athena_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
