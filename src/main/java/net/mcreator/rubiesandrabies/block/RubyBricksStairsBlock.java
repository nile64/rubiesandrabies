package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class RubyBricksStairsBlock extends StairBlock {
	public RubyBricksStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.METAL).strength(5f, 30f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 30f;
	}
}