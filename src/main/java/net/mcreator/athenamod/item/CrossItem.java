
package net.mcreator.athenamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrossItem extends Item {
	public CrossItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
