package net.mcreator.athenamod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.athenamod.entity.MoonMiteEntity;

public class MoonMiteModel extends GeoModel<MoonMiteEntity> {
	@Override
	public ResourceLocation getAnimationResource(MoonMiteEntity entity) {
		return new ResourceLocation("athena_mod", "animations/moonmite.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoonMiteEntity entity) {
		return new ResourceLocation("athena_mod", "geo/moonmite.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoonMiteEntity entity) {
		return new ResourceLocation("athena_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
