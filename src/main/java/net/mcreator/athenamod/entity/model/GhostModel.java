package net.mcreator.athenamod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.athenamod.entity.GhostEntity;

public class GhostModel extends GeoModel<GhostEntity> {
	@Override
	public ResourceLocation getAnimationResource(GhostEntity entity) {
		return new ResourceLocation("athena_mod", "animations/ghost.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GhostEntity entity) {
		return new ResourceLocation("athena_mod", "geo/ghost.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GhostEntity entity) {
		return new ResourceLocation("athena_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
