package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class ZorpiniumOreBlock extends Block {
	public ZorpiniumOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHERITE_BLOCK).strength(1f, 10f));
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