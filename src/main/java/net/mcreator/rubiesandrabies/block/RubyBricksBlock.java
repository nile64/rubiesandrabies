package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class RubyBricksBlock extends Block {
	public RubyBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 30f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.DIDGERIDOO));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}