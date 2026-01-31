package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class EmulsifiedThunderEssenceBlock extends Block {
	public EmulsifiedThunderEssenceBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.POLISHED_DEEPSLATE).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}