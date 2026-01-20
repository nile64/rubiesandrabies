package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class UnfiredBathBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public UnfiredBathBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(14, 0, 14, 16, 4, 16), box(4, 0, 14, 6, 4, 16), box(4, 0, -8, 6, 4, -6), box(14, 0, -8, 16, 4, -6), box(4, 4, -8, 16, 6, 16), box(14, 6, -8, 16, 14, 16), box(4, 6, -8, 6, 14, 16), box(6, 6, 14, 14, 14, 16),
					box(6, 6, -8, 14, 14, -6));
			case NORTH -> Shapes.or(box(0, 0, 0, 2, 4, 2), box(10, 0, 0, 12, 4, 2), box(10, 0, 22, 12, 4, 24), box(0, 0, 22, 2, 4, 24), box(0, 4, 0, 12, 6, 24), box(0, 6, 0, 2, 14, 24), box(10, 6, 0, 12, 14, 24), box(2, 6, 0, 10, 14, 2),
					box(2, 6, 22, 10, 14, 24));
			case EAST -> Shapes.or(box(14, 0, 0, 16, 4, 2), box(14, 0, 10, 16, 4, 12), box(-8, 0, 10, -6, 4, 12), box(-8, 0, 0, -6, 4, 2), box(-8, 4, 0, 16, 6, 12), box(-8, 6, 0, 16, 14, 2), box(-8, 6, 10, 16, 14, 12), box(14, 6, 2, 16, 14, 10),
					box(-8, 6, 2, -6, 14, 10));
			case WEST -> Shapes.or(box(0, 0, 14, 2, 4, 16), box(0, 0, 4, 2, 4, 6), box(22, 0, 4, 24, 4, 6), box(22, 0, 14, 24, 4, 16), box(0, 4, 4, 24, 6, 16), box(0, 6, 14, 24, 14, 16), box(0, 6, 4, 24, 14, 6), box(0, 6, 6, 2, 14, 14),
					box(22, 6, 6, 24, 14, 14));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}