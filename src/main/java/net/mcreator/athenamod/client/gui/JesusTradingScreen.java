package net.mcreator.athenamod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.athenamod.world.inventory.JesusTradingMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class JesusTradingScreen extends AbstractContainerScreen<JesusTradingMenu> {
	private final static HashMap<String, Object> guistate = JesusTradingMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public JesusTradingScreen(JesusTradingMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("athena_mod:textures/screens/jesus_trading.png");

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

		guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/bible.png"), this.leftPos + 6, this.topPos + 25, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/fallenangleblood.png"), this.leftPos + 6, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/arrow.png"), this.leftPos + 132, this.topPos + 25, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/arrow.png"), this.leftPos + 132, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/goldenwool.png"), this.leftPos + 33, this.topPos + 25, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("athena_mod:textures/screens/goldenwool.png"), this.leftPos + 33, this.topPos + 52, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.athena_mod.jesus_trading.label_empty"), 60, 34, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.athena_mod.jesus_trading.label_192"), 42, 34, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.athena_mod.jesus_trading.label_for_sale"), 2, 1, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.athena_mod.jesus_trading.label_cost"), 31, 13, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.athena_mod.jesus_trading.label_256"), 42, 61, -12829636, false);
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
