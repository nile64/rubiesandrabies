package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.rubiesandrabies.procedures.MakeNonNewtonianFluidLiquidProcedure;

public class NonNewtonianFluidBlockBlock extends Block {
	public NonNewtonianFluidBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(-1, 3600000));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		MakeNonNewtonianFluidLiquidProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}