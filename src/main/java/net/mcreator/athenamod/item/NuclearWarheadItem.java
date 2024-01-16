
package net.mcreator.athenamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NuclearWarheadItem extends Item {
	public NuclearWarheadItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
