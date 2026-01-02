/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.rubiesandrabies.block.RubyBricksBlock;
import net.mcreator.rubiesandrabies.block.BlockOfFemgramBlock;
import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

import java.util.function.Function;

public class RubiesandrabiesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RubiesandrabiesMod.MODID);
	public static final DeferredBlock<Block> RUBY_BRICKS;
	public static final DeferredBlock<Block> BLOCK_OF_FEMGRAM;
	static {
		RUBY_BRICKS = register("ruby_bricks", RubyBricksBlock::new);
		BLOCK_OF_FEMGRAM = register("block_of_femgram", BlockOfFemgramBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}