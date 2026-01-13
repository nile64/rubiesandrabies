package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

public class MakeNonNewtonianFluidSolidProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), RubiesandrabiesModBlocks.NON_NEWTONIAN_FLUID_BLOCK.get().defaultBlockState(), 3);
	}
}