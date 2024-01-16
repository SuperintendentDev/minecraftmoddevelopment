package net.mcreator.athenamod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.athenamod.init.AthenaModModBlocks;

public class NuclearBombOnBlockRightClicked2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (world instanceof ServerLevel _level)
			FallingBlockEntity.fall(_level, BlockPos.containing(x, y, z), AthenaModModBlocks.NUKEACTIVATED.get().defaultBlockState());
	}
}
