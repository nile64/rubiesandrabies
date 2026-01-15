package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class HisGreatnessBlock extends Block {
	public HisGreatnessBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}