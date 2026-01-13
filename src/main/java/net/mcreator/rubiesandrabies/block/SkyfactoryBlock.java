package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SkyfactoryBlock extends Block {
	public SkyfactoryBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 10f).lightLevel(s -> 15));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		if (entity instanceof ServerPlayer player) {
			player.openMenu(new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Skyfactory");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new SkyfactoryGuiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
				}
			}, pos);
		}
		return InteractionResult.SUCCESS;
	}
}