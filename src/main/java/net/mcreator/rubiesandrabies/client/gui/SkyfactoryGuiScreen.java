package net.mcreator.rubiesandrabies.client.gui;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.rubiesandrabies.world.inventory.SkyfactoryGuiMenu;
import net.mcreator.rubiesandrabies.network.SkyfactoryGuiButtonMessage;
import net.mcreator.rubiesandrabies.init.RubiesandrabiesModScreens;

public class SkyfactoryGuiScreen extends AbstractContainerScreen<SkyfactoryGuiMenu> implements RubiesandrabiesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_commence_the_construction;

	public SkyfactoryGuiScreen(SkyfactoryGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 174;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("rubiesandrabies:textures/screens/skyfactory_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("rubiesandrabies:textures/screens/untitlfgfdged.png"), this.leftPos + 60, this.topPos + 3, 0, 0, 55, 52, 55, 52);
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.rubiesandrabies.skyfactory_gui.label_skyfactory"), 4, 5, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_commence_the_construction = Button.builder(Component.translatable("gui.rubiesandrabies.skyfactory_gui.button_commence_the_construction"), e -> {
			int x = SkyfactoryGuiScreen.this.x;
			int y = SkyfactoryGuiScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new SkyfactoryGuiButtonMessage(0, x, y, z));
				SkyfactoryGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 55, 155, 20).build();
		this.addRenderableWidget(button_commence_the_construction);
	}
}