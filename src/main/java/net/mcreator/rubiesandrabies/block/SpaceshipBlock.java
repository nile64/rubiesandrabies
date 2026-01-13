package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SpaceshipBlock extends Block {
	public SpaceshipBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SPAWNER).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}