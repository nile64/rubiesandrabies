package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ZorpiniumOreBlock extends Block {
	public ZorpiniumOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHERITE_BLOCK).strength(30f, 1200f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public int getExpDrop(BlockState state, LevelAccessor level, BlockPos pos, BlockEntity blockEntity, Entity breaker, ItemStack tool) {
		return Mth.randomBetweenInclusive(level.getRandom(), 0, 4);
	}
}