package net.mcreator.athenamod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.athenamod.entity.SnailEntity;

public class SnailModel extends GeoModel<SnailEntity> {
	@Override
	public ResourceLocation getAnimationResource(SnailEntity entity) {
		return new ResourceLocation("athena_mod", "animations/snail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SnailEntity entity) {
		return new ResourceLocation("athena_mod", "geo/snail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SnailEntity entity) {
		return new ResourceLocation("athena_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
