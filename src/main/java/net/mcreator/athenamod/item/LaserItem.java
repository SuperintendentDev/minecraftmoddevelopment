
package net.mcreator.athenamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LaserItem extends Item {
	public LaserItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
