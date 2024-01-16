package net.mcreator.athenamod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.athenamod.entity.RockMonsterEntity;
import net.mcreator.athenamod.AthenaModMod;

public class RockMonsterOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof RockMonsterEntity) {
			((RockMonsterEntity) entity).setAnimation("rockmonsteremerge");
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:rockmonsteremerge")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:rockmonsteremerge")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.COBBLESTONE.defaultBlockState()));
		world.levelEvent(2001, BlockPos.containing(x, y + 1, z), Block.getId(Blocks.COBBLESTONE.defaultBlockState()));
		AthenaModMod.queueServerWork(10, () -> {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.COBBLESTONE.defaultBlockState()));
			world.levelEvent(2001, BlockPos.containing(x, y + 1, z), Block.getId(Blocks.COBBLESTONE.defaultBlockState()));
		});
		AthenaModMod.queueServerWork(20, () -> {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.COBBLESTONE.defaultBlockState()));
			world.levelEvent(2001, BlockPos.containing(x, y + 1, z), Block.getId(Blocks.COBBLESTONE.defaultBlockState()));
		});
	}
}
