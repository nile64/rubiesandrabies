package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModBlocks;
import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

public class MakeNonNewtonianFluidLiquidProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RubiesandrabiesMod.queueServerWork(20, () -> {
			world.setBlock(BlockPos.containing(x, y, z), RubiesandrabiesModBlocks.NON_NEWTONIAN_FLUID.get().defaultBlockState(), 3);
		});
	}
}