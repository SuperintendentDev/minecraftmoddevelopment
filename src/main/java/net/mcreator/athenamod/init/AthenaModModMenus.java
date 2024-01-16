
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.athenamod.world.inventory.ResearchTableGuiMenu;
import net.mcreator.athenamod.world.inventory.JesusTradingMenu;
import net.mcreator.athenamod.AthenaModMod;

public class AthenaModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AthenaModMod.MODID);
	public static final RegistryObject<MenuType<ResearchTableGuiMenu>> RESEARCH_TABLE_GUI = REGISTRY.register("research_table_gui", () -> IForgeMenuType.create(ResearchTableGuiMenu::new));
	public static final RegistryObject<MenuType<JesusTradingMenu>> JESUS_TRADING = REGISTRY.register("jesus_trading", () -> IForgeMenuType.create(JesusTradingMenu::new));
}
