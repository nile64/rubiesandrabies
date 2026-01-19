package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BloodBlock extends LiquidBlock {
	public BloodBlock(BlockBehaviour.Properties properties) {
		super(RubiesandrabiesModFluids.BLOOD.get(), properties.mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}