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
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rubiesandrabies.item.*;
import net.mcreator.rubiesandrabies.block.TheBloodbathBlock;
import net.mcreator.rubiesandrabies.block.AbyssallGrassBlock;
import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

import java.util.function.Function;

public class RubiesandrabiesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RubiesandrabiesMod.MODID);
	public static final DeferredItem<Item> BAT_WING;
	public static final DeferredItem<Item> RUBY;
	public static final DeferredItem<Item> RUBY_BRICKS;
	public static final DeferredItem<Item> THE_INCIDENT;
	public static final DeferredItem<Item> LIFE_IS_ROBLOX_MUSIC_DISC;
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
	public static final DeferredItem<Item> RUBY_TETRAHEXAHEDRON_STAIRS;
	public static final DeferredItem<Item> XRAYBLOCK;
	public static final DeferredItem<Item> RUBY_TILE_STAIRS;
	public static final DeferredItem<Item> RUBYTETRAHEXAHEDRONBRICKSLAB;
	public static final DeferredItem<Item> RUBYTETRAHEXAHEDRONBRICKS;
	public static final DeferredItem<Item> RUBYTILESLAB;
	public static final DeferredItem<Item> RUBYTILES;
	public static final DeferredItem<Item> ARTIFICIALRUBYBLOCK;
	public static final DeferredItem<Item> RUBY_BLOCK;
	public static final DeferredItem<Item> NON_NEWTONIAN_FLUID_BUCKET;
	public static final DeferredItem<Item> SKYFACTORY;
	public static final DeferredItem<Item> THENIUMSWORD;
	public static final DeferredItem<Item> NON_NEWTONIAN_FLUID_BLOCK;
	public static final DeferredItem<Item> URANIUM;
	public static final DeferredItem<Item> SUGARCANE_PICKAXE;
	public static final DeferredItem<Item> THENIUM_ESSENCE_BLOCK;
	public static final DeferredItem<Item> THENIUM_ESSENCE;
	public static final DeferredItem<Item> RUBY_SHELF;
	public static final DeferredItem<Item> ENTER_PLANET_TEST_ITEM;
	public static final DeferredItem<Item> SPACESHIP;
	public static final DeferredItem<Item> RACIST_INGOT;
	public static final DeferredItem<Item> R_HMOB_SPAWN_EGG;
	public static final DeferredItem<Item> RACIST_ORE;
	public static final DeferredItem<Item> GP_0_LIQUID_BUCKET;
	public static final DeferredItem<Item> EXIT_PLANET_ITEM_TEST;
	public static final DeferredItem<Item> MOLDED_ZORPINIUM;
	public static final DeferredItem<Item> ZORPINIUM_ORE;
	public static final DeferredItem<Item> UNPURIFIED_ZORPINIUM_GEM;
	public static final DeferredItem<Item> ZORPINIUM_MOLD;
	public static final DeferredItem<Item> ZORPINIUM_CORE;
	public static final DeferredItem<Item> ZORPINIUMARMOR_HELMET;
	public static final DeferredItem<Item> ZORPINIUMARMOR_CHESTPLATE;
	public static final DeferredItem<Item> ZORPINIUMARMOR_LEGGINGS;
	public static final DeferredItem<Item> ZORPINIUMARMOR_BOOTS;
	public static final DeferredItem<Item> ZORPINIUM_REACTOR;
	public static final DeferredItem<Item> IRON_PLATE;
	public static final DeferredItem<Item> ZORPINIUM_ROD;
	public static final DeferredItem<Item> HIS_GREATNESS;
	public static final DeferredItem<Item> ZORPINIUM_PICKAXE;
	public static final DeferredItem<Item> PURIFIED_ZORPINIUM;
	public static final DeferredItem<Item> ZORPINIUM_SABER;
	public static final DeferredItem<Item> COMPRESSED_COMPRESSED_RUBY;
	public static final DeferredItem<Item> RUBYDOOR;
	public static final DeferredItem<Item> COMPRESSED_RUBY;
	public static final DeferredItem<Item> COMPRESSED_COMPRESSED_COMPRESSED_RUBY;
	public static final DeferredItem<Item> GHAST_COW_SPAWN_EGG;
	public static final DeferredItem<Item> COMPRESSED_COMPRESSED_COMPRESSED_COMPRESSED_COMPRESSED_RUBY;
	public static final DeferredItem<Item> RACIST_HELMET;
	public static final DeferredItem<Item> RACIST_CHESTPLATE;
	public static final DeferredItem<Item> RACIST_LEGGINGS;
	public static final DeferredItem<Item> RACIST_BOOTS;
	public static final DeferredItem<Item> SKY_ESSENCE;
	public static final DeferredItem<Item> MODIUM_ESSENCE;
	public static final DeferredItem<Item> COMPRESSED_COMPRESSED_COMPRESSED_COMPRESSED_RUBY;
	public static final DeferredItem<Item> ABYSSALLMATTER;
	public static final DeferredItem<Item> GREGTECH;
	public static final DeferredItem<Item> ARCHFIEND_DICE;
	public static final DeferredItem<Item> LEAVEEVIL;
	public static final DeferredItem<Item> ABYSSALL_GRASS;
	public static final DeferredItem<Item> TESTICALS;
	public static final DeferredItem<Item> DAMN;
	public static final DeferredItem<Item> HAMMER;
	public static final DeferredItem<Item> FEMGRAM_SPAWN_EGG;
	public static final DeferredItem<Item> METAL_GEAR_SOLID;
	public static final DeferredItem<Item> ACHIEVMENTITEM;
	public static final DeferredItem<Item> HARDENED_MOON;
	public static final DeferredItem<Item> MOON_SURFACE;
	public static final DeferredItem<Item> RED_SCYTHE;
	public static final DeferredItem<Item> PAGE_OF_EVIL;
	public static final DeferredItem<Item> RED_SLICER;
	public static final DeferredItem<Item> BLOOD_BUCKET;
	public static final DeferredItem<Item> EVILBLEND;
	public static final DeferredItem<Item> STARDUST_REMNANT;
	public static final DeferredItem<Item> BATH_TUB;
	public static final DeferredItem<Item> STARDUST_PICKAXE;
	public static final DeferredItem<Item> THE_BLOODBATH;
	public static final DeferredItem<Item> CRUSHED_QUARTZ;
	public static final DeferredItem<Item> AT_THE_SPEED_OF_LIGHT_DISC;
	public static final DeferredItem<Item> GLUE;
	public static final DeferredItem<Item> UNFIRED_BATH;
	public static final DeferredItem<Item> BIC_MAX;
	public static final DeferredItem<Item> MANGLED_ARMOR_PIECE;
	public static final DeferredItem<Item> ARMOR_OF_BLUNDER_HELMET;
	public static final DeferredItem<Item> ARMOR_OF_BLUNDER_CHESTPLATE;
	public static final DeferredItem<Item> ARMOR_OF_BLUNDER_LEGGINGS;
	public static final DeferredItem<Item> ARMOR_OF_BLUNDER_BOOTS;
	public static final DeferredItem<Item> KNIGHT_OF_BLUNDER_SPAWN_EGG;
	public static final DeferredItem<Item> STAGNANT_KNIGHTS_DIGNITY;
	public static final DeferredItem<Item> GUITAR_STRING;
	public static final DeferredItem<Item> DAVE_MUSTAINE_SPAWN_EGG;
	public static final DeferredItem<Item> KNIGHTS_DIGNITY;
	public static final DeferredItem<Item> JACKSON_KING_V;
	public static final DeferredItem<Item> FALLEN_ONES_BROADSWORD;
	public static final DeferredItem<Item> WATCHHIMBECOMEAGOD;
	public static final DeferredItem<Item> QUESTION_MARK;
	public static final DeferredItem<Item> EVIL_MACHINE;
	public static final DeferredItem<Item> THUNDEROUS_ESSENCE;
	public static final DeferredItem<Item> THUNDER_HELMET;
	public static final DeferredItem<Item> THUNDER_CHESTPLATE;
	public static final DeferredItem<Item> THUNDER_LEGGINGS;
	public static final DeferredItem<Item> THUNDER_BOOTS;
	public static final DeferredItem<Item> THUNDER_BLADE;
	public static final DeferredItem<Item> LIGHTNING_IN_A_BOTTLE;
	public static final DeferredItem<Item> SOLIDIFIED_THUNDEROUS_ESSENCE;
	public static final DeferredItem<Item> THUNDEROUS_DIGNITY;
	public static final DeferredItem<Item> THUNDER_INFUSED_INGOT;
	public static final DeferredItem<Item> KNIGHT_OF_THUNDER_SPAWN_EGG;
	public static final DeferredItem<Item> TEBLOCK;
	public static final DeferredItem<Item> TROLLENTITYARTIFICIAL_SPAWN_EGG;
	public static final DeferredItem<Item> TROLLENTITY_SPAWN_EGG;
	public static final DeferredItem<Item> CHIPPED_BLOCK;
	public static final DeferredItem<Item> THE_TRAVEL_DIMENSION;
	public static final DeferredItem<Item> THE_TRAVELLER_SPAWN_EGG;
	static {
		BAT_WING = register("bat_wing", BatWingItem::new);
		RUBY = register("ruby", RubyItem::new);
		RUBY_BRICKS = block(RubiesandrabiesModBlocks.RUBY_BRICKS);
		THE_INCIDENT = register("the_incident", TheIncidentItem::new);
		LIFE_IS_ROBLOX_MUSIC_DISC = register("life_is_roblox_music_disc", LifeIsRobloxMusicDiscItem::new);
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
		RUBY_TETRAHEXAHEDRON_STAIRS = block(RubiesandrabiesModBlocks.RUBY_TETRAHEXAHEDRON_STAIRS);
		XRAYBLOCK = block(RubiesandrabiesModBlocks.XRAYBLOCK, new Item.Properties().rarity(Rarity.EPIC));
		RUBY_TILE_STAIRS = block(RubiesandrabiesModBlocks.RUBY_TILE_STAIRS);
		RUBYTETRAHEXAHEDRONBRICKSLAB = block(RubiesandrabiesModBlocks.RUBYTETRAHEXAHEDRONBRICKSLAB);
		RUBYTETRAHEXAHEDRONBRICKS = block(RubiesandrabiesModBlocks.RUBYTETRAHEXAHEDRONBRICKS);
		RUBYTILESLAB = block(RubiesandrabiesModBlocks.RUBYTILESLAB);
		RUBYTILES = block(RubiesandrabiesModBlocks.RUBYTILES);
		ARTIFICIALRUBYBLOCK = block(RubiesandrabiesModBlocks.ARTIFICIALRUBYBLOCK);
		RUBY_BLOCK = block(RubiesandrabiesModBlocks.RUBY_BLOCK);
		NON_NEWTONIAN_FLUID_BUCKET = register("non_newtonian_fluid_bucket", NonNewtonianFluidItem::new);
		SKYFACTORY = block(RubiesandrabiesModBlocks.SKYFACTORY);
		THENIUMSWORD = register("theniumsword", TheniumswordItem::new);
		NON_NEWTONIAN_FLUID_BLOCK = block(RubiesandrabiesModBlocks.NON_NEWTONIAN_FLUID_BLOCK);
		URANIUM = register("uranium", UraniumItem::new);
		SUGARCANE_PICKAXE = register("sugarcane_pickaxe", SugarcanePickaxeItem::new);
		THENIUM_ESSENCE_BLOCK = block(RubiesandrabiesModBlocks.THENIUM_ESSENCE_BLOCK);
		THENIUM_ESSENCE = register("thenium_essence", TheniumEssenceItem::new);
		RUBY_SHELF = block(RubiesandrabiesModBlocks.RUBY_SHELF);
		ENTER_PLANET_TEST_ITEM = register("enter_planet_test_item", EnterPlanetTestItemItem::new);
		SPACESHIP = block(RubiesandrabiesModBlocks.SPACESHIP, new Item.Properties().stacksTo(63));
		RACIST_INGOT = register("racist_ingot", RacistIngotItem::new);
		R_HMOB_SPAWN_EGG = register("r_hmob_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.R_HMOB.get(), properties));
		RACIST_ORE = block(RubiesandrabiesModBlocks.RACIST_ORE, new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).fireResistant());
		GP_0_LIQUID_BUCKET = register("gp_0_liquid_bucket", Gp0LiquidItem::new);
		EXIT_PLANET_ITEM_TEST = register("exit_planet_item_test", ExitPlanetItemTestItem::new);
		MOLDED_ZORPINIUM = register("molded_zorpinium", MoldedZorpiniumItem::new);
		ZORPINIUM_ORE = block(RubiesandrabiesModBlocks.ZORPINIUM_ORE, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
		UNPURIFIED_ZORPINIUM_GEM = register("unpurified_zorpinium_gem", UnpurifiedZorpiniumGemItem::new);
		ZORPINIUM_MOLD = register("zorpinium_mold", ZorpiniumPurifierItem::new);
		ZORPINIUM_CORE = register("zorpinium_core", ZorpiniumCoreItem::new);
		ZORPINIUMARMOR_HELMET = register("zorpiniumarmor_helmet", ZorpiniumItem.Helmet::new);
		ZORPINIUMARMOR_CHESTPLATE = register("zorpiniumarmor_chestplate", ZorpiniumItem.Chestplate::new);
		ZORPINIUMARMOR_LEGGINGS = register("zorpiniumarmor_leggings", ZorpiniumItem.Leggings::new);
		ZORPINIUMARMOR_BOOTS = register("zorpiniumarmor_boots", ZorpiniumItem.Boots::new);
		ZORPINIUM_REACTOR = register("zorpinium_reactor", ZorpiniumReactorItem::new);
		IRON_PLATE = register("iron_plate", IronPlateItem::new);
		ZORPINIUM_ROD = register("zorpinium_rod", ZorpiniumRodItem::new);
		HIS_GREATNESS = block(RubiesandrabiesModBlocks.HIS_GREATNESS, new Item.Properties().rarity(Rarity.EPIC));
		ZORPINIUM_PICKAXE = register("zorpinium_pickaxe", ZorpiniumPickaxeItem::new);
		PURIFIED_ZORPINIUM = register("purified_zorpinium", PurifiedZorpiniumItem::new);
		ZORPINIUM_SABER = register("zorpinium_saber", ZorpiniumSaberItem::new);
		COMPRESSED_COMPRESSED_RUBY = register("compressed_compressed_ruby", CompressedCompressedRubyItem::new);
		RUBYDOOR = doubleBlock(RubiesandrabiesModBlocks.RUBYDOOR);
		COMPRESSED_RUBY = register("compressed_ruby", CompressedRubyItem::new);
		COMPRESSED_COMPRESSED_COMPRESSED_RUBY = register("compressed_compressed_compressed_ruby", CompressedCompressedCompressedRubyItem::new);
		GHAST_COW_SPAWN_EGG = register("ghast_cow_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.GHAST_COW.get(), properties));
		COMPRESSED_COMPRESSED_COMPRESSED_COMPRESSED_COMPRESSED_RUBY = register("compressed_compressed_compressed_compressed_compressed_ruby", CompressedCompressedCompressedCompressedCompressedRubyItem::new);
		RACIST_HELMET = register("racist_helmet", RacistItem.Helmet::new);
		RACIST_CHESTPLATE = register("racist_chestplate", RacistItem.Chestplate::new);
		RACIST_LEGGINGS = register("racist_leggings", RacistItem.Leggings::new);
		RACIST_BOOTS = register("racist_boots", RacistItem.Boots::new);
		SKY_ESSENCE = register("sky_essence", SkyEssenceItem::new);
		MODIUM_ESSENCE = register("modium_essence", ModiumEssenceItem::new);
		COMPRESSED_COMPRESSED_COMPRESSED_COMPRESSED_RUBY = register("compressed_compressed_compressed_compressed_ruby", CompressedCompressedCompressedCompressedRubyItem::new);
		ABYSSALLMATTER = block(RubiesandrabiesModBlocks.ABYSSALLMATTER);
		GREGTECH = block(RubiesandrabiesModBlocks.GREGTECH);
		ARCHFIEND_DICE = register("archfiend_dice", ArchfiendDiceItem::new);
		LEAVEEVIL = register("leaveevil", LeaveevilItem::new);
		ABYSSALL_GRASS = register("abyssall_grass", AbyssallGrassBlock.Item::new);
		TESTICALS = register("testicals", TesticalsItem::new);
		DAMN = block(RubiesandrabiesModBlocks.DAMN);
		HAMMER = register("hammer", HammerItem::new);
		FEMGRAM_SPAWN_EGG = register("femgram_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.FEMGRAM.get(), properties));
		METAL_GEAR_SOLID = register("metal_gear_solid", MetalGearSolidItem::new);
		ACHIEVMENTITEM = register("achievmentitem", AchievmentitemItem::new);
		HARDENED_MOON = block(RubiesandrabiesModBlocks.HARDENED_MOON);
		MOON_SURFACE = block(RubiesandrabiesModBlocks.MOON_SURFACE);
		RED_SCYTHE = register("red_scythe", RedScytheItem::new);
		PAGE_OF_EVIL = register("page_of_evil", PageOfEvilItem::new);
		RED_SLICER = register("red_slicer", RedSlicerItem::new);
		BLOOD_BUCKET = register("blood_bucket", BloodItem::new);
		EVILBLEND = register("evilblend", EvilblendItem::new);
		STARDUST_REMNANT = register("stardust_remnant", StardustRemnantItem::new);
		BATH_TUB = block(RubiesandrabiesModBlocks.BATH_TUB, new Item.Properties().stacksTo(1));
		STARDUST_PICKAXE = register("stardust_pickaxe", StardustPickaxeItem::new);
		THE_BLOODBATH = register("the_bloodbath", properties -> new TheBloodbathBlock.Item(properties.stacksTo(1)));
		CRUSHED_QUARTZ = register("crushed_quartz", CrushedQuartzItem::new);
		AT_THE_SPEED_OF_LIGHT_DISC = register("at_the_speed_of_light_disc", AtTheSpeedOfLightDiscItem::new);
		GLUE = register("glue", GlueItem::new);
		UNFIRED_BATH = block(RubiesandrabiesModBlocks.UNFIRED_BATH, new Item.Properties().stacksTo(1));
		BIC_MAX = register("bic_max", BicMaxItem::new);
		MANGLED_ARMOR_PIECE = register("mangled_armor_piece", MangledArmorPieceItem::new);
		ARMOR_OF_BLUNDER_HELMET = register("armor_of_blunder_helmet", ArmorOfBlunderItem.Helmet::new);
		ARMOR_OF_BLUNDER_CHESTPLATE = register("armor_of_blunder_chestplate", ArmorOfBlunderItem.Chestplate::new);
		ARMOR_OF_BLUNDER_LEGGINGS = register("armor_of_blunder_leggings", ArmorOfBlunderItem.Leggings::new);
		ARMOR_OF_BLUNDER_BOOTS = register("armor_of_blunder_boots", ArmorOfBlunderItem.Boots::new);
		KNIGHT_OF_BLUNDER_SPAWN_EGG = register("knight_of_blunder_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.KNIGHT_OF_BLUNDER.get(), properties));
		STAGNANT_KNIGHTS_DIGNITY = block(RubiesandrabiesModBlocks.STAGNANT_KNIGHTS_DIGNITY);
		GUITAR_STRING = register("guitar_string", GuitarStringItem::new);
		DAVE_MUSTAINE_SPAWN_EGG = register("dave_mustaine_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.DAVE_MUSTAINE.get(), properties));
		KNIGHTS_DIGNITY = block(RubiesandrabiesModBlocks.KNIGHTS_DIGNITY, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
		JACKSON_KING_V = register("jackson_king_v", JacksonKingVItem::new);
		FALLEN_ONES_BROADSWORD = register("fallen_ones_broadsword", FallenOnesBroadswordItem::new);
		WATCHHIMBECOMEAGOD = register("watchhimbecomeagod", HolyWarsThePunishmentDueItem::new);
		QUESTION_MARK = register("question_mark", QuestionMarkItem::new);
		EVIL_MACHINE = block(RubiesandrabiesModBlocks.EVIL_MACHINE);
		THUNDEROUS_ESSENCE = register("thunderous_essence", ThunderousEssenceItem::new);
		THUNDER_HELMET = register("thunder_helmet", ThunderItem.Helmet::new);
		THUNDER_CHESTPLATE = register("thunder_chestplate", ThunderItem.Chestplate::new);
		THUNDER_LEGGINGS = register("thunder_leggings", ThunderItem.Leggings::new);
		THUNDER_BOOTS = register("thunder_boots", ThunderItem.Boots::new);
		THUNDER_BLADE = register("thunder_blade", ThunderBladeItem::new);
		LIGHTNING_IN_A_BOTTLE = register("lightning_in_a_bottle", LightningInABottleItem::new);
		SOLIDIFIED_THUNDEROUS_ESSENCE = block(RubiesandrabiesModBlocks.SOLIDIFIED_THUNDEROUS_ESSENCE, new Item.Properties().rarity(Rarity.RARE));
		THUNDEROUS_DIGNITY = block(RubiesandrabiesModBlocks.THUNDEROUS_DIGNITY);
		THUNDER_INFUSED_INGOT = register("thunder_infused_ingot", ThunderInfusedIngotItem::new);
		KNIGHT_OF_THUNDER_SPAWN_EGG = register("knight_of_thunder_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.KNIGHT_OF_THUNDER.get(), properties));
		TEBLOCK = block(RubiesandrabiesModBlocks.TEBLOCK);
		TROLLENTITYARTIFICIAL_SPAWN_EGG = register("trollentityartificial_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.TROLLENTITYARTIFICIAL.get(), properties));
		TROLLENTITY_SPAWN_EGG = register("trollentity_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.TROLLENTITY.get(), properties));
		CHIPPED_BLOCK = block(RubiesandrabiesModBlocks.CHIPPED_BLOCK);
		THE_TRAVEL_DIMENSION = register("the_travel_dimension", TheTravelDimensionItem::new);
		THE_TRAVELLER_SPAWN_EGG = register("the_traveller_spawn_egg", properties -> new SpawnEggItem(RubiesandrabiesModEntities.THE_TRAVELLER.get(), properties));
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

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new DoubleHighBlockItem(block.get(), prop), properties);
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), NON_NEWTONIAN_FLUID_BUCKET.get());
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), GP_0_LIQUID_BUCKET.get());
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), BLOOD_BUCKET.get());
	}
}