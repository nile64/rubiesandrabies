package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class RacismPlanetPlayerEntersDimensionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("rubiesandrabies:racism_planet"))) {
		} else {
			if ((entity.level().dimension()) == Level.OVERWORLD) {
			} else {
				if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("rubiesandrabies:the_moon"))) {
				}
			}
		}
	}
}