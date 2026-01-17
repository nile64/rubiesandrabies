package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

public class MamamiaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("rubiesandrabies:sdpicemeatball")), SoundSource.BLOCKS, 1, (float) 2.5);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("rubiesandrabies:sdpicemeatball")), SoundSource.BLOCKS, 1, (float) 2.5, false);
			}
		}
	}
}