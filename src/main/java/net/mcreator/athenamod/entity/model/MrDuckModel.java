package net.mcreator.athenamod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.athenamod.entity.MrDuckEntity;

public class MrDuckModel extends GeoModel<MrDuckEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrDuckEntity entity) {
		return new ResourceLocation("athena_mod", "animations/duck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrDuckEntity entity) {
		return new ResourceLocation("athena_mod", "geo/duck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrDuckEntity entity) {
		return new ResourceLocation("athena_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
