
package net.mcreator.athenamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SnailShellItem extends Item {
	public SnailShellItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
