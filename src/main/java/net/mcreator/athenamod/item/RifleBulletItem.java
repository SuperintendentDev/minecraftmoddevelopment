
package net.mcreator.athenamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RifleBulletItem extends Item {
	public RifleBulletItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
