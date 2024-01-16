
package net.mcreator.athenamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WoodGunStockItem extends Item {
	public WoodGunStockItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
