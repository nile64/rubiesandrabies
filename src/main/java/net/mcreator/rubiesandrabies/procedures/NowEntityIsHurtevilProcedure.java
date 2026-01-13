package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

public class NowEntityIsHurtevilProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		if (((damagesource.getEntity()) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RubiesandrabiesModItems.DELETED_MOD_ELEMENT.get()) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.PLAYER_ATTACK)), 50);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("rubiesandrabies:impaled")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("rubiesandrabies:impaled")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
		}
	}
}