package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

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
		super(properties.mapColor(MapColor.GLOW_LICHEN).sound(SoundType.SLIME_BLOCK).strength(3f, 999999999f).lightLevel(s -> 3).instrument(NoteBlockInstrument.CUSTOM_HEAD));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
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