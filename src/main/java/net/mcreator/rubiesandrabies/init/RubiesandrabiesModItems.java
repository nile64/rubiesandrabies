/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rubiesandrabies.item.*;
import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

import java.util.function.Function;

public class RubiesandrabiesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RubiesandrabiesMod.MODID);
	public static final DeferredItem<Item> BAT_WING;
	public static final DeferredItem<Item> RUBY;
	public static final DeferredItem<Item> RUBY_BRICKS;
	public static final DeferredItem<Item> THE_INCIDENT;
	public static final DeferredItem<Item> LIFE_IS_ROBLOX_MUSIC_DISC;
	public static final DeferredItem<Item> FEMGRAM_SPAWN_EGG;
	public static final DeferredItem<Item> BLOCK_OF_FEMGRAM;
	public static final DeferredItem<Item> RUBY_BRICKS_STAIRS;
	public static final DeferredItem<Item> RUBY_BRICKS_SLAB;
	public static final DeferredItem<Item> EVIL_NYLIUM;
	public static final DeferredItem<Item> NOWIUM_ESSENCE;
	public static final DeferredItem<Item> NOW_SPAWN_EGG;
	public static final DeferredItem<Item> NOWIUM_BLOCK;
	public static final DeferredItem<Item> MEATBALL_MOOSE_SPAWN_EGG;
	public static final DeferredItem<Item> NETHERTHING;
	public static final DeferredItem<Item> GORILLA_SPAWN_EGG;
	public static final DeferredItem<Item> BANANA;
	public static final DeferredItem<Item> THENIUM_ESSENCE;
	public static final DeferredItem<Item> THENIUM_ESSENCE_BLOCK;
	public static final DeferredItem<Item> THENIUMSWORD;
	public static final DeferredItem<Item> SKYFACTORY;
	public static final DeferredItem<Item> URANIUM;
	public static final DeferredItem<Item> SUGARCANE_PICKAXE;
	public static final DeferredItem<Item> RACIST_ORE;
	public static final DeferredItem<Item> ENTER_PLANET_TEST_ITEM;
	public static final DeferredItem<Item> EXIT_PLANET_ITEM_TEST;
	public static final DeferredItem<Item> RACIST_INGOT;
	public static final DeferredItem<Item> RUBY_TETRAHEXAHEDRON_STAIRS;
	public static final DeferredItem<Item> RUBY_TILE_STAIRS;
	public static final DeferredItem<Item> RUBYTETRAHEXAHEDRONBRICKSLAB;
	public static final DeferredItem<Item> NON_NEWTONIAN_FLUID_BUCKET;
	public static final DeferredItem<Item> RUBYTILESLAB;
	public static final DeferredItem<Item> RUBYTILES;
	public static final DeferredItem<Item> XRAYBLOCK;
	public static final DeferredItem<Item> RUBYTETRAHEXAHEDRONBRICKS;
	public static final DeferredItem<Item> NON_NEWTONIAN_FLUID_BLOCK;
	public static final DeferredItem<Item> ARTIFICIALRUBYBLOCK;
	public static final DeferredItem<Item> RUBY_BLOCK;
	public static final DeferredItem<Item> SPACESHIP;
	public static final DeferredItem<Item> GP_0_LIQUID_BUCKET;
	static {
		BAT_WING = register("bat_wing", BatWingItem::new);
		RUBY = register("ruby", RubyItem::new);
		RUBY_BRICKS = block(RubiesandrabiesModBlocks.RUBY_BRICKS);
		THE_INCIDENT = register("the_incident", TheIncidentItem::new);
		LIFE_IS_ROBLOX_MUSIC_DISC = register("life_is_roblox_music_disc", LifeIsRobloxMusicDiscItem::new);
		FEMGRAM_SPAWN_EGG = register("femgram_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.FEMGRAM.get(), properties));
		BLOCK_OF_FEMGRAM = block(RubiesandrabiesModBlocks.BLOCK_OF_FEMGRAM);
		RUBY_BRICKS_STAIRS = block(RubiesandrabiesModBlocks.RUBY_BRICKS_STAIRS);
		RUBY_BRICKS_SLAB = block(RubiesandrabiesModBlocks.RUBY_BRICKS_SLAB);
		EVIL_NYLIUM = block(RubiesandrabiesModBlocks.EVIL_NYLIUM);
		NOWIUM_ESSENCE = register("nowium_essence", NowiumEssenceItem::new);
		NOW_SPAWN_EGG = register("now_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.NOW.get(), properties));
		NOWIUM_BLOCK = block(RubiesandrabiesModBlocks.NOWIUM_BLOCK);
		MEATBALL_MOOSE_SPAWN_EGG = register("meatball_moose_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.MEATBALL_MOOSE.get(), properties));
		NETHERTHING = block(RubiesandrabiesModBlocks.NETHERTHING);
		GORILLA_SPAWN_EGG = register("gorilla_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.GORILLA.get(), properties));
		BANANA = register("banana", BananaItem::new);
		THENIUM_ESSENCE = register("thenium_essence", TheniumEssenceItem::new);
		THENIUM_ESSENCE_BLOCK = block(RubiesandrabiesModBlocks.THENIUM_ESSENCE_BLOCK);
		THENIUMSWORD = register("theniumsword", TheniumswordItem::new);
		SKYFACTORY = block(RubiesandrabiesModBlocks.SKYFACTORY);
		URANIUM = register("uranium", UraniumItem::new);
		SUGARCANE_PICKAXE = register("sugarcane_pickaxe", SugarcanePickaxeItem::new);
		RACIST_ORE = block(RubiesandrabiesModBlocks.RACIST_ORE, new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).fireResistant());
		ENTER_PLANET_TEST_ITEM = register("enter_planet_test_item", EnterPlanetTestItemItem::new);
		EXIT_PLANET_ITEM_TEST = register("exit_planet_item_test", ExitPlanetItemTestItem::new);
		RACIST_INGOT = register("racist_ingot", RacistIngotItem::new);
		RUBY_TETRAHEXAHEDRON_STAIRS = block(RubiesandrabiesModBlocks.RUBY_TETRAHEXAHEDRON_STAIRS);
		RUBY_TILE_STAIRS = block(RubiesandrabiesModBlocks.RUBY_TILE_STAIRS);
		RUBYTETRAHEXAHEDRONBRICKSLAB = block(RubiesandrabiesModBlocks.RUBYTETRAHEXAHEDRONBRICKSLAB);
		NON_NEWTONIAN_FLUID_BUCKET = register("non_newtonian_fluid_bucket", NonNewtonianFluidItem::new);
		RUBYTILESLAB = block(RubiesandrabiesModBlocks.RUBYTILESLAB);
		RUBYTILES = block(RubiesandrabiesModBlocks.RUBYTILES);
		XRAYBLOCK = block(RubiesandrabiesModBlocks.XRAYBLOCK, new Item.Properties().rarity(Rarity.EPIC));
		RUBYTETRAHEXAHEDRONBRICKS = block(RubiesandrabiesModBlocks.RUBYTETRAHEXAHEDRONBRICKS);
		NON_NEWTONIAN_FLUID_BLOCK = block(RubiesandrabiesModBlocks.NON_NEWTONIAN_FLUID_BLOCK);
		ARTIFICIALRUBYBLOCK = block(RubiesandrabiesModBlocks.ARTIFICIALRUBYBLOCK);
		RUBY_BLOCK = block(RubiesandrabiesModBlocks.RUBY_BLOCK);
		SPACESHIP = block(RubiesandrabiesModBlocks.SPACESHIP, new Item.Properties().stacksTo(63));
		GP_0_LIQUID_BUCKET = register("gp_0_liquid_bucket", Gp0LiquidItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), NON_NEWTONIAN_FLUID_BUCKET.get());
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), GP_0_LIQUID_BUCKET.get());
	}
}