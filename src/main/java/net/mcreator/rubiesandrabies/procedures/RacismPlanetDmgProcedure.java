package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

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