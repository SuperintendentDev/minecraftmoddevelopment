package net.mcreator.athenamod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.athenamod.entity.NerdEntity;

public class NerdModel extends GeoModel<NerdEntity> {
	@Override
	public ResourceLocation getAnimationResource(NerdEntity entity) {
		return new ResourceLocation("athena_mod", "animations/nerd.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NerdEntity entity) {
		return new ResourceLocation("athena_mod", "geo/nerd.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NerdEntity entity) {
		return new ResourceLocation("athena_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
