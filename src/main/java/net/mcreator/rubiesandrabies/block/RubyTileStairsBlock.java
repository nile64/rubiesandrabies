package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RubyTileStairsBlock extends StairBlock {
	public RubyTileStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.GLASS).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}