
package net.mcreator.athenamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GlockSwitchItem extends Item {
	public GlockSwitchItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
