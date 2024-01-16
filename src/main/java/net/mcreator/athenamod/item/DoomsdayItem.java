
package net.mcreator.athenamod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DoomsdayItem extends RecordItem {
	public DoomsdayItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:doomsday")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6000);
	}
}
