package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class XrayblockBlock extends Block {
	public XrayblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SCULK).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}