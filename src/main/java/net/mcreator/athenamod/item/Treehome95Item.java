
package net.mcreator.athenamod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class Treehome95Item extends RecordItem {
	public Treehome95Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("athena_mod:treehome95")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4000);
	}
}
