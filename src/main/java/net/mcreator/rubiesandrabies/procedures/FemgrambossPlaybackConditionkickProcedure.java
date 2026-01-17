package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

public class FemgrambossPlaybackConditionkickProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof LivingEntity _livEnt0 && _livEnt0.swinging && (entity instanceof FemgrambossEntity _datEntI ? _datEntI.getEntityData().get(FemgrambossEntity.DATA_punch) : 0) == 1;
	}
}