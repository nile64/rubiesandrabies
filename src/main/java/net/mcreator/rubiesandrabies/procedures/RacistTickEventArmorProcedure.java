package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

public class RacistTickEventArmorProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.WITHER)), 1);
	}
}