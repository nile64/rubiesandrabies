package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RubytileslabBlock extends SlabBlock {
	public RubytileslabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}