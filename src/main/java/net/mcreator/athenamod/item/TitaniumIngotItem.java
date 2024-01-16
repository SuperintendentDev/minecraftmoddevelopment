
package net.mcreator.athenamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TitaniumIngotItem extends Item {
	public TitaniumIngotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
