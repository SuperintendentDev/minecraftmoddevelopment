package net.mcreator.athenamod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.athenamod.init.AthenaModModItems;

public class PistolCanUseRangedItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AthenaModModItems.BULLET.get())) : false) {
		}
	}
}
