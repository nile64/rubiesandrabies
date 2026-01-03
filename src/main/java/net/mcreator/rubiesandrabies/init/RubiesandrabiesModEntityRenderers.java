/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.rubiesandrabies.client.renderer.NowRenderer;
import net.mcreator.rubiesandrabies.client.renderer.FemgramRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class RubiesandrabiesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RubiesandrabiesModEntities.FEMGRAM.get(), FemgramRenderer::new);
		event.registerEntityRenderer(RubiesandrabiesModEntities.NOW.get(), NowRenderer::new);
	}
}