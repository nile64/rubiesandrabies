package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DamnBlock extends Block {
	public DamnBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}