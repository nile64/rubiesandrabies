package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class MoonSurfaceBlock extends FallingBlock {
	public static final MapCodec<MoonSurfaceBlock> CODEC = simpleCodec(MoonSurfaceBlock::new);

	@Override
	public MapCodec<MoonSurfaceBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockstate, BlockGetter world, BlockPos pos) {
		return blockstate.getMapColor(world, pos).col;
	}

	public MoonSurfaceBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 1.5f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}