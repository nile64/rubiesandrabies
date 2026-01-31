package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class Gp0LiquidBlock extends LiquidBlock {
	public Gp0LiquidBlock(BlockBehaviour.Properties properties) {
		super(RubiesandrabiesModFluids.GP_0_LIQUID.get(), properties.mapColor(MapColor.PODZOL).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15).noCollission().noLootTable().liquid()
				.pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}