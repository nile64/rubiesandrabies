package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

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