package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

public class MakeNonNewtonianFluidLiquidProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RubiesandrabiesMod.queueServerWork(20, () -> {
			world.setBlock(BlockPos.containing(x, y, z), RubiesandrabiesModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
		});
	}
}