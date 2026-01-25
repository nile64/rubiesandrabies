package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

public class ThunderousDignityOnBlockRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), RubiesandrabiesModBlocks.STAGNANT_KNIGHTS_DIGNITY.get().defaultBlockState(), 3);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = RubiesandrabiesModEntities.DELETED_MOD_ELEMENT.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0.5, 0);
			}
		}
	}
}