package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class NotorchesProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TORCH || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WALL_TORCH
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SOUL_TORCH || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SOUL_WALL_TORCH)
				&& (entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("rubiesandrabies:the_depository_abyss"))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.redstone_torch.burnout")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.redstone_torch.burnout")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SMOKE, x, y, z, 7, 3, 3, 3, 0.4);
		}
	}
}