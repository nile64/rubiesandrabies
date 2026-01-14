package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class NonightvisionProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("rubiesandrabies:the_depository_abyss"))) {
			if (entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MobEffects.NIGHT_VISION)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.NIGHT_VISION);
			}
		}
	}
}