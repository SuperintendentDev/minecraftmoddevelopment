
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.athenamod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.athenamod.client.gui.ResearchTableGuiScreen;
import net.mcreator.athenamod.client.gui.JesusTradingScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AthenaModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AthenaModModMenus.RESEARCH_TABLE_GUI.get(), ResearchTableGuiScreen::new);
			MenuScreens.register(AthenaModModMenus.JESUS_TRADING.get(), JesusTradingScreen::new);
		});
	}
}
