package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModFluids;

public class BloodBlock extends LiquidBlock {
	public BloodBlock(BlockBehaviour.Properties properties) {
		super(RubiesandrabiesModFluids.BLOOD.get(), properties.mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}