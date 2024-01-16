
package net.mcreator.athenamod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.athenamod.init.AthenaModModItems;

public class TitaniumHoeItem extends HoeItem {
	public TitaniumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 4000;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AthenaModModItems.TITANIUM_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().fireResistant());
	}
}
