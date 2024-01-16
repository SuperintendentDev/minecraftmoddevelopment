
package net.mcreator.athenamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GoldenLeafItem extends Item {
	public GoldenLeafItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
