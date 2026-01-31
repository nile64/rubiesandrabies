/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.rubiesandrabies.client.model.*;

@EventBusSubscriber(Dist.CLIENT)
public class RubiesandrabiesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelruby_horror.LAYER_LOCATION, Modelruby_horror::createBodyLayer);
		event.registerLayerDefinition(Modelgorilla.LAYER_LOCATION, Modelgorilla::createBodyLayer);
		event.registerLayerDefinition(ModelNow.LAYER_LOCATION, ModelNow::createBodyLayer);
		event.registerLayerDefinition(Modeltrollentityattacking.LAYER_LOCATION, Modeltrollentityattacking::createBodyLayer);
		event.registerLayerDefinition(Modelmeatball_moose.LAYER_LOCATION, Modelmeatball_moose::createBodyLayer);
		event.registerLayerDefinition(Modelfemgramupgraded.LAYER_LOCATION, Modelfemgramupgraded::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modelthe_traveller.LAYER_LOCATION, Modelthe_traveller::createBodyLayer);
		event.registerLayerDefinition(Modeltrollentity.LAYER_LOCATION, Modeltrollentity::createBodyLayer);
	}
}