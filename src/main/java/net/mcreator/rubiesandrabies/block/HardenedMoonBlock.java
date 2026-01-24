package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class HardenedMoonBlock extends Block {
	public HardenedMoonBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(2f, 4f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}