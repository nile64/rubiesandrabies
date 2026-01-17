package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber(Dist.CLIENT)
public class RacismPlanetPlayerEntersDimensionProcedure {
	@SubscribeEvent
	public static void onSkyRendered(RenderLevelStageEvent.AfterSky event) {
		Minecraft mc = Minecraft.getInstance();
		execute(event, event);
	}

	public static void execute(RenderLevelStageEvent.AfterSky skyRenderEvent) {
		execute(null, skyRenderEvent);
	}

	private static void execute(@Nullable Event event, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		if (skyRenderEvent == null)
			return;
		RenderUtils.renderCustomSun(skyRenderEvent, ResourceLocation.parse("modid:textures/block/minecraft-cow-head-1024x1024-3108380750.png"));
	}
}