package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ThunderousDignityBlock extends Block {
	public ThunderousDignityBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DEEPSLATE_BRICKS).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}