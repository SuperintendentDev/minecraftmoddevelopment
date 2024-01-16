package net.mcreator.athenamod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ZillaRoarProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isAlive()) {
			if (Mth.nextDouble(RandomSource.create(), 1, 20) <= 3) {
				if (Mth.nextDouble(RandomSource.create(), 1, 10) <= 5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:zillaroar2")), SoundSource.NEUTRAL, 5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:zillaroar2")), SoundSource.NEUTRAL, 5, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:zillaroar1")), SoundSource.NEUTRAL, 5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:zillaroar1")), SoundSource.NEUTRAL, 5, 1, false);
						}
					}
				}
			}
		}
	}
}
