package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RubyBricksStairsBlock extends StairBlock {
	public RubyBricksStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.METAL).strength(5f, 30f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 30f;
	}
}