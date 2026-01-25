package net.mcreator.rubiesandrabies.client.gui;

public class SpaceMenuScreen extends AbstractContainerScreen<SpaceMenuMenu> implements RubiesandrabiesModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_racist_planet;
	private Button button_overworld;
	private Button button_moon;

	public SpaceMenuScreen(SpaceMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 314;
		this.imageHeight = 164;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("rubiesandrabies:textures/screens/space_menu.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("rubiesandrabies:textures/screens/evilman.png"), this.leftPos + 122, this.topPos + 51, 0, 0, 64, 64, 64, 64);
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
	}

	@Override
	public void init() {
		super.init();
		button_racist_planet = Button.builder(Component.translatable("gui.rubiesandrabies.space_menu.button_racist_planet"), e -> {
			int x = SpaceMenuScreen.this.x;
			int y = SpaceMenuScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new SpaceMenuButtonMessage(0, x, y, z));
				SpaceMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 8, this.topPos + 9, 93, 20).build();
		this.addRenderableWidget(button_racist_planet);
		button_overworld = Button.builder(Component.translatable("gui.rubiesandrabies.space_menu.button_overworld"), e -> {
			int x = SpaceMenuScreen.this.x;
			int y = SpaceMenuScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new SpaceMenuButtonMessage(1, x, y, z));
				SpaceMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 110, this.topPos + 136, 90, 20).build();
		this.addRenderableWidget(button_overworld);
		button_moon = Button.builder(Component.translatable("gui.rubiesandrabies.space_menu.button_moon"), e -> {
			int x = SpaceMenuScreen.this.x;
			int y = SpaceMenuScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new SpaceMenuButtonMessage(2, x, y, z));
				SpaceMenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 118, this.topPos + 8, 72, 20).build();
		this.addRenderableWidget(button_moon);
	}
}