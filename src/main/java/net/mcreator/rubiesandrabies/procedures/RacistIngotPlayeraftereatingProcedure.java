package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

public class RacistIngotPlayeraftereatingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.TNT);
		if (world instanceof ServerLevel _level) {
			LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
			entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
			_level.addFreshEntity(entityToSpawn);
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(RubiesandrabiesModMobEffects.RABIES, 600, 1));
	}
}