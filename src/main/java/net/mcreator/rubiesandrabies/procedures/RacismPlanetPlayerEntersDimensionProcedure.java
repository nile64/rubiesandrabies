package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

public class RacismPlanetPlayerEntersDimensionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("rubiesandrabies:racism_planet"))) {
		} else {
			if ((entity.level().dimension()) == Level.OVERWORLD) {
			} else {
				if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("rubiesandrabies:deleted_mod_element"))) {
				}
			}
		}
	}
}