package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RubyBricksSlabBlock extends SlabBlock {
	public RubyBricksSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 30f).requiresCorrectToolForDrops());
	}
}