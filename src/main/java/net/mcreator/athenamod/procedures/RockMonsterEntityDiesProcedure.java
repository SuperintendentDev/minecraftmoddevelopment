package net.mcreator.athenamod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RockMonsterEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.COBBLESTONE.defaultBlockState()));
		world.levelEvent(2001, BlockPos.containing(x, y + 1, z), Block.getId(Blocks.COBBLESTONE.defaultBlockState()));
	}
}
