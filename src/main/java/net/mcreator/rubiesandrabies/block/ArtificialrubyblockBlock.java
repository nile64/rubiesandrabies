package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ArtificialrubyblockBlock extends Block {
	public ArtificialrubyblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(5f, 40f).lightLevel(s -> 1).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.DRAGON));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}
}