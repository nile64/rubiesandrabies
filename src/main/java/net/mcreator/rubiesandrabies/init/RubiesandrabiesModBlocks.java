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
	public static final DeferredBlock<Block> RUBY_TETRAHEXAHEDRON_STAIRS;
	public static final DeferredBlock<Block> XRAYBLOCK;
	public static final DeferredBlock<Block> RUBY_TILE_STAIRS;
	public static final DeferredBlock<Block> RUBYTETRAHEXAHEDRONBRICKSLAB;
	public static final DeferredBlock<Block> RUBYTETRAHEXAHEDRONBRICKS;
	public static final DeferredBlock<Block> RUBYTILESLAB;
	public static final DeferredBlock<Block> RUBYTILES;
	public static final DeferredBlock<Block> ARTIFICIALRUBYBLOCK;
	public static final DeferredBlock<Block> RUBY_BLOCK;
	public static final DeferredBlock<Block> NON_NEWTONIAN_FLUID;
	public static final DeferredBlock<Block> SKYFACTORY;
	public static final DeferredBlock<Block> NON_NEWTONIAN_FLUID_BLOCK;
	public static final DeferredBlock<Block> THENIUM_ESSENCE_BLOCK;
	public static final DeferredBlock<Block> RUBY_SHELF;
	public static final DeferredBlock<Block> SPACESHIP;
	public static final DeferredBlock<Block> RACIST_ORE;
	public static final DeferredBlock<Block> GP_0_LIQUID;
	static {
		RUBY_BRICKS = register("ruby_bricks", RubyBricksBlock::new);
		BLOCK_OF_FEMGRAM = register("block_of_femgram", BlockOfFemgramBlock::new);
		RUBY_BRICKS_STAIRS = register("ruby_bricks_stairs", RubyBricksStairsBlock::new);
		RUBY_BRICKS_SLAB = register("ruby_bricks_slab", RubyBricksSlabBlock::new);
		EVIL_NYLIUM = register("evil_nylium", EvilNyliumBlock::new);
		NOWIUM_BLOCK = register("nowium_block", NowiumBlockBlock::new);
		NETHERTHING = register("netherthing", NetherthingBlock::new);
		RUBY_TETRAHEXAHEDRON_STAIRS = register("ruby_tetrahexahedron_stairs", RubyTetrahexahedronStairsBlock::new);
		XRAYBLOCK = register("xrayblock", XrayblockBlock::new);
		RUBY_TILE_STAIRS = register("ruby_tile_stairs", RubyTileStairsBlock::new);
		RUBYTETRAHEXAHEDRONBRICKSLAB = register("rubytetrahexahedronbrickslab", RubytetrahexahedronbrickslabBlock::new);
		RUBYTETRAHEXAHEDRONBRICKS = register("rubytetrahexahedronbricks", RubytetrahexahedronbricksBlock::new);
		RUBYTILESLAB = register("rubytileslab", RubytileslabBlock::new);
		RUBYTILES = register("rubytiles", RubytilesBlock::new);
		ARTIFICIALRUBYBLOCK = register("artificialrubyblock", ArtificialrubyblockBlock::new);
		RUBY_BLOCK = register("ruby_block", RubyBlockBlock::new);
		NON_NEWTONIAN_FLUID = register("non_newtonian_fluid", NonNewtonianFluidBlock::new);
		SKYFACTORY = register("skyfactory", SkyfactoryBlock::new);
		NON_NEWTONIAN_FLUID_BLOCK = register("non_newtonian_fluid_block", NonNewtonianFluidBlockBlock::new);
		THENIUM_ESSENCE_BLOCK = register("thenium_essence_block", TheniumEssenceBlockBlock::new);
		RUBY_SHELF = register("ruby_shelf", RubyShelfBlock::new);
		SPACESHIP = register("spaceship", SpaceshipBlock::new);
		RACIST_ORE = register("racist_ore", RacistOreBlock::new);
		GP_0_LIQUID = register("gp_0_liquid", Gp0LiquidBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}