
package net.mcreator.athenamod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.athenamod.init.AthenaModModItems;

public class TitaniumSwordItem extends SwordItem {
	public TitaniumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 4000;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 5f;
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
		}, 3, -3.8f, new Item.Properties().fireResistant());
	}
}
