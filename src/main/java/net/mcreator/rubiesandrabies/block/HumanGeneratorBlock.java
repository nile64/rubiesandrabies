package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class HumanGeneratorBlock extends Block {
	public HumanGeneratorBlock(BlockBehaviour.Properties properties) {
		super(properties
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.netherite_block.break")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.netherite_block.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.netherite_block.place")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.netherite_block.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.netherite_block.fall"))))
				.strength(25f, 1200f).pushReaction(PushReaction.IGNORE));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
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
		HumanGeneratorOnBlockRightclickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}