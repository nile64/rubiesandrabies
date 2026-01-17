/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.rubiesandrabies.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class RubiesandrabiesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RubiesandrabiesModEntities.FEMGRAM.get(), FemgramRenderer::new);
		event.registerEntityRenderer(RubiesandrabiesModEntities.NOW.get(), NowRenderer::new);
		event.registerEntityRenderer(RubiesandrabiesModEntities.MEATBALL_MOOSE.get(), MeatballMooseRenderer::new);
		event.registerEntityRenderer(RubiesandrabiesModEntities.GORILLA.get(), GorillaRenderer::new);
		event.registerEntityRenderer(RubiesandrabiesModEntities.R_HMOB.get(), RHmobRenderer::new);
		event.registerEntityRenderer(RubiesandrabiesModEntities.GHAST_COW.get(), GhastCowRenderer::new);
		event.registerEntityRenderer(RubiesandrabiesModEntities.FEMGRAM.get(), FemgrambossRenderer::new);
	}
}