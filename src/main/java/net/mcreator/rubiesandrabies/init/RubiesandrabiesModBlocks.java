/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.rubiesandrabies.block.*;
import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

import java.util.function.Function;

public class RubiesandrabiesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RubiesandrabiesMod.MODID);
	public static final DeferredBlock<Block> RUBY_BRICKS;
	public static final DeferredBlock<Block> BLOCK_OF_FEMGRAM;
	public static final DeferredBlock<Block> RUBY_BRICKS_STAIRS;
	public static final DeferredBlock<Block> RUBY_BRICKS_SLAB;
	public static final DeferredBlock<Block> EVIL_NYLIUM;
	public static final DeferredBlock<Block> NOWIUM_BLOCK;
	public static final DeferredBlock<Block> NETHERTHING;
	public static final DeferredBlock<Block> THENIUM_ESSENCE_BLOCK;
	public static final DeferredBlock<Block> SKYFACTORY;
	public static final DeferredBlock<Block> RACIST_ORE;
	static {
		RUBY_BRICKS = register("ruby_bricks", RubyBricksBlock::new);
		BLOCK_OF_FEMGRAM = register("block_of_femgram", BlockOfFemgramBlock::new);
		RUBY_BRICKS_STAIRS = register("ruby_bricks_stairs", RubyBricksStairsBlock::new);
		RUBY_BRICKS_SLAB = register("ruby_bricks_slab", RubyBricksSlabBlock::new);
		EVIL_NYLIUM = register("evil_nylium", EvilNyliumBlock::new);
		NOWIUM_BLOCK = register("nowium_block", NowiumBlockBlock::new);
		NETHERTHING = register("netherthing", NetherthingBlock::new);
		THENIUM_ESSENCE_BLOCK = register("thenium_essence_block", TheniumEssenceBlockBlock::new);
		SKYFACTORY = register("skyfactory", SkyfactoryBlock::new);
		RACIST_ORE = register("racist_ore", RacistOreBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}