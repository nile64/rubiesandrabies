package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.neoforge.client.event.RenderLevelStageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.rubiesandrabies.client.RenderUtils;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class RacismPlanetPlayerEntersDimensionProcedure {
	@SubscribeEvent
	public static void onSkyRendered(RenderLevelStageEvent.AfterSky event) {
		Minecraft mc = Minecraft.getInstance();
		execute(event, mc.player, event);
	}

	public static void execute(Entity entity, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		execute(null, entity, skyRenderEvent);
	}

	private static void execute(@Nullable Event event, Entity entity, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		if (entity == null || skyRenderEvent == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("rubiesandrabies:racism_planet"))) {
			RenderUtils.renderCustomMoon(skyRenderEvent, ResourceLocation.parse("rubiesandrabies:textures/gp0_phases.png"));
			RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("rubiesandrabies:textures/spaceskybox.png"), 0xffffff, Math.min(0, 1));
		} else {
			if ((entity.level().dimension()) == Level.OVERWORLD) {
				RenderUtils.renderCustomMoon(skyRenderEvent, ResourceLocation.parse("rubiesandrabies:textures/moon_phases_replace.png"));
				RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("rubiesandrabies:textures/spaceskybox.png"), 0xffffff, Math.min(0, 1));
			} else {
				if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("rubiesandrabies:the_moon"))) {
					RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("rubiesandrabies:textures/spaceskybox.png"), 0xffffff, Math.min(1, 1));
				}
			}
		}
	}
}