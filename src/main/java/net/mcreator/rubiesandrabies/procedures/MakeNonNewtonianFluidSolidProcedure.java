package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModBlocks;

public class MakeNonNewtonianFluidSolidProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), RubiesandrabiesModBlocks.NON_NEWTONIAN_FLUID_BLOCK.get().defaultBlockState(), 3);
	}
}