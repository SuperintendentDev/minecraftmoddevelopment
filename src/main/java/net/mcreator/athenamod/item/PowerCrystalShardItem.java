
package net.mcreator.athenamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PowerCrystalShardItem extends Item {
	public PowerCrystalShardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
