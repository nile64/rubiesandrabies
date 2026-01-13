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
	public static final DeferredBlock<Block> RUBY_BLOCK;
	public static final DeferredBlock<Block> ARTIFICIALRUBYBLOCK;
	public static final DeferredBlock<Block> RUBYTETRAHEXAHEDRONBRICKS;
	public static final DeferredBlock<Block> RUBYTILES;
	public static final DeferredBlock<Block> RUBY_TETRAHEXAHEDRON_STAIRS;
	public static final DeferredBlock<Block> RUBY_TILE_STAIRS;
	public static final DeferredBlock<Block> RUBYTETRAHEXAHEDRONBRICKSLAB;
	public static final DeferredBlock<Block> RUBYTILESLAB;
	public static final DeferredBlock<Block> XRAYBLOCK;
	static {
		RUBY_BRICKS = register("ruby_bricks", RubyBricksBlock::new);
		BLOCK_OF_FEMGRAM = register("block_of_femgram", BlockOfFemgramBlock::new);
		RUBY_BRICKS_STAIRS = register("ruby_bricks_stairs", RubyBricksStairsBlock::new);
		RUBY_BRICKS_SLAB = register("ruby_bricks_slab", RubyBricksSlabBlock::new);
		EVIL_NYLIUM = register("evil_nylium", EvilNyliumBlock::new);
		NOWIUM_BLOCK = register("nowium_block", NowiumBlockBlock::new);
		NETHERTHING = register("netherthing", NetherthingBlock::new);
		RUBY_BLOCK = register("ruby_block", RubyBlockBlock::new);
		ARTIFICIALRUBYBLOCK = register("artificialrubyblock", ArtificialrubyblockBlock::new);
		RUBYTETRAHEXAHEDRONBRICKS = register("rubytetrahexahedronbricks", RubytetrahexahedronbricksBlock::new);
		RUBYTILES = register("rubytiles", RubytilesBlock::new);
		RUBY_TETRAHEXAHEDRON_STAIRS = register("ruby_tetrahexahedron_stairs", RubyTetrahexahedronStairsBlock::new);
		RUBY_TILE_STAIRS = register("ruby_tile_stairs", RubyTileStairsBlock::new);
		RUBYTETRAHEXAHEDRONBRICKSLAB = register("rubytetrahexahedronbrickslab", RubytetrahexahedronbrickslabBlock::new);
		RUBYTILESLAB = register("rubytileslab", RubytileslabBlock::new);
		XRAYBLOCK = register("xrayblock", XrayblockBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}