package net.mcreator.athenamod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.athenamod.world.inventory.ResearchTableGuiMenu;
import net.mcreator.athenamod.procedures.Progressbar9Procedure;
import net.mcreator.athenamod.procedures.Progressbar8Procedure;
import net.mcreator.athenamod.procedures.Progressbar7Procedure;
import net.mcreator.athenamod.procedures.Progressbar6Procedure;
import net.mcreator.athenamod.procedures.Progressbar5Procedure;
import net.mcreator.athenamod.procedures.Progressbar4Procedure;
import net.mcreator.athenamod.procedures.Progressbar3Procedure;
import net.mcreator.athenamod.procedures.Progressbar2Procedure;
import net.mcreator.athenamod.procedures.Progressbar1Procedure;
import net.mcreator.athenamod.procedures.Progressbar10Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ResearchTableGuiScreen extends AbstractContainerScreen<ResearchTableGuiMenu> {
	private final static HashMap<String, Object> guistate = ResearchTableGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ResearchTableGuiScreen(ResearchTableGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("athena_mod:textures/screens/research_table_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/progress_bar_empty.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 54, 10, 54, 10);

		if (Progressbar1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/progress_bar_filled_0.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 54, 10, 54, 10);
		}
		if (Progressbar2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/progress_bar_filled_1.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 54, 10, 54, 10);
		}
		if (Progressbar3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/progress_bar_filled_2.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 54, 10, 54, 10);
		}
		if (Progressbar4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/progress_bar_filled_3.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 54, 10, 54, 10);
		}
		if (Progressbar5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/progress_bar_filled_4.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 54, 10, 54, 10);
		}
		if (Progressbar6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/progress_bar_filled_5.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 54, 10, 54, 10);
		}
		if (Progressbar7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/progress_bar_filled_6.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 54, 10, 54, 10);
		}
		if (Progressbar8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/progress_bar_filled_7.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 54, 10, 54, 10);
		}
		if (Progressbar9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/progress_bar_filled_8.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 54, 10, 54, 10);
		}
		if (Progressbar10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/progress_bar_filled_9.png"), this.leftPos + 60, this.topPos + 34, 0, 0, 54, 10, 54, 10);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.athena_mod.research_table_gui.label_item_to_research"), 44, 12, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
