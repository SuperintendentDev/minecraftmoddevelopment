package net.mcreator.athenamod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.athenamod.init.AthenaModModEntities;
import net.mcreator.athenamod.init.AthenaModModBlocks;
import net.mcreator.athenamod.AthenaModMod;

public class SatanicPentagramBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == AthenaModModBlocks.SATANIC_BASE.get()) {
			AthenaModMod.queueServerWork(20, () -> {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Satan has been summoned..."), false);
				AthenaModMod.queueServerWork(180, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AthenaModModEntities.SATAN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			});
		}
	}
}
