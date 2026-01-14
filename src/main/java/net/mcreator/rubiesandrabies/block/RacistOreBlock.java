package net.mcreator.rubiesandrabies.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class RacistOreBlock extends FallingBlock {
	public static final MapCodec<RacistOreBlock> CODEC = simpleCodec(RacistOreBlock::new);

	@Override
	public MapCodec<RacistOreBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockstate, BlockGetter world, BlockPos pos) {
		return blockstate.getMapColor(world, pos).col;
	}

	public RacistOreBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.GLOW_LICHEN).sound(SoundType.SLIME_BLOCK).strength(3f, 999999999f).lightLevel(s -> 3).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.CUSTOM_HEAD));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public boolean isSignalSource(BlockState state) {
		return true;
	}

	@Override
	public int getSignal(BlockState blockstate, BlockGetter blockAccess, BlockPos pos, Direction direction) {
		return 15;
	}
}