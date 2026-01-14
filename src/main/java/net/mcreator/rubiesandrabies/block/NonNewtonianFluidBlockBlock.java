package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

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