
package net.mcreator.athenamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KeyItem extends Item {
	public KeyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
