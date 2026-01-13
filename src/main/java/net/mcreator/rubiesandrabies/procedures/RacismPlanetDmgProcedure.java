package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

public class RacismPlanetDmgProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < 15; index0++) {
			RubiesandrabiesMod.queueServerWork(1200, () -> {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.FREEZE)), 1);
			});
		}
	}
}