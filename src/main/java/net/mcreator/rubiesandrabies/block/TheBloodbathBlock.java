package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class TheBloodbathBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public TheBloodbathBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(12, 0, 14, 14, 4, 16), box(2, 0, 14, 4, 4, 16), box(2, 0, -8, 4, 4, -6), box(12, 0, -8, 14, 4, -6), box(2, 4, -8, 14, 6, 16), box(12, 6, -8, 14, 14, 16), box(2, 6, -8, 4, 14, 16), box(4, 6, 14, 12, 14, 16),
					box(4, 6, -8, 12, 14, -6), box(4, 10, -6, 12, 13, 14));
			case NORTH -> Shapes.or(box(2, 0, 0, 4, 4, 2), box(12, 0, 0, 14, 4, 2), box(12, 0, 22, 14, 4, 24), box(2, 0, 22, 4, 4, 24), box(2, 4, 0, 14, 6, 24), box(2, 6, 0, 4, 14, 24), box(12, 6, 0, 14, 14, 24), box(4, 6, 0, 12, 14, 2),
					box(4, 6, 22, 12, 14, 24), box(4, 10, 2, 12, 13, 22));
			case EAST -> Shapes.or(box(14, 0, 2, 16, 4, 4), box(14, 0, 12, 16, 4, 14), box(-8, 0, 12, -6, 4, 14), box(-8, 0, 2, -6, 4, 4), box(-8, 4, 2, 16, 6, 14), box(-8, 6, 2, 16, 14, 4), box(-8, 6, 12, 16, 14, 14), box(14, 6, 4, 16, 14, 12),
					box(-8, 6, 4, -6, 14, 12), box(-6, 10, 4, 14, 13, 12));
			case WEST -> Shapes.or(box(0, 0, 12, 2, 4, 14), box(0, 0, 2, 2, 4, 4), box(22, 0, 2, 24, 4, 4), box(22, 0, 12, 24, 4, 14), box(0, 4, 2, 24, 6, 14), box(0, 6, 12, 24, 14, 14), box(0, 6, 2, 24, 14, 4), box(0, 6, 4, 2, 14, 12),
					box(22, 6, 4, 24, 14, 12), box(2, 10, 4, 22, 13, 12));
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

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		TheBloodbathOnBlockRightclickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	public static class Item extends BlockItem {
		public Item(Item.Properties properties) {
			super(RubiesandrabiesModBlocks.THE_BLOODBATH.get(), properties);
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("block.rubiesandrabies.the_bloodbath.description_0"));
		}
	}
}