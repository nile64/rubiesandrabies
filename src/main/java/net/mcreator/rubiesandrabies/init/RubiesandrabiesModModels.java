/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.rubiesandrabies.client.model.Modelmeatball_moose;
import net.mcreator.rubiesandrabies.client.model.ModelCustomModel;

@EventBusSubscriber(Dist.CLIENT)
public class RubiesandrabiesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modelmeatball_moose.LAYER_LOCATION, Modelmeatball_moose::createBodyLayer);
	}
}