package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.neoforge.client.event.RenderLevelStageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.rubiesandrabies.client.RenderUtils;

import javax.annotation.Nullable;

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