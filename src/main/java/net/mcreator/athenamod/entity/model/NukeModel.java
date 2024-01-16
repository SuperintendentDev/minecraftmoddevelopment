package net.mcreator.athenamod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.athenamod.entity.NukeEntity;

public class NukeModel extends GeoModel<NukeEntity> {
	@Override
	public ResourceLocation getAnimationResource(NukeEntity entity) {
		return new ResourceLocation("athena_mod", "animations/nuke.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NukeEntity entity) {
		return new ResourceLocation("athena_mod", "geo/nuke.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NukeEntity entity) {
		return new ResourceLocation("athena_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
