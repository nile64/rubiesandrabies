package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class NonNewtonianFluidBlock extends LiquidBlock {
	public NonNewtonianFluidBlock(BlockBehaviour.Properties properties) {
		super(RubiesandrabiesModFluids.NON_NEWTONIAN_FLUID.get(), properties.mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}