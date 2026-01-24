/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

@EventBusSubscriber
public class RubiesandrabiesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RubiesandrabiesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RUBIES_RABIES_TAB = REGISTRY.register("rubies_rabies_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rubiesandrabies.rubies_rabies_tab")).icon(() -> new ItemStack(RubiesandrabiesModItems.BAT_WING.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RubiesandrabiesModItems.BAT_WING.get());
				tabData.accept(RubiesandrabiesModItems.RUBY.get());
				tabData.accept(RubiesandrabiesModBlocks.RUBY_BRICKS.get().asItem());
				tabData.accept(RubiesandrabiesModItems.THE_INCIDENT.get());
				tabData.accept(RubiesandrabiesModItems.LIFE_IS_ROBLOX_MUSIC_DISC.get());
				tabData.accept(RubiesandrabiesModItems.FEMGRAMOLD_SPAWN_EGG.get());
				tabData.accept(RubiesandrabiesModBlocks.BLOCK_OF_FEMGRAM.get().asItem());
				tabData.accept(RubiesandrabiesModBlocks.RUBY_BRICKS_STAIRS.get().asItem());
				tabData.accept(RubiesandrabiesModBlocks.RUBY_BRICKS_SLAB.get().asItem());
				tabData.accept(RubiesandrabiesModItems.NOWIUM_ESSENCE.get());
				tabData.accept(RubiesandrabiesModItems.NOW_SPAWN_EGG.get());
				tabData.accept(RubiesandrabiesModBlocks.NOWIUM_BLOCK.get().asItem());
				tabData.accept(RubiesandrabiesModItems.MEATBALL_MOOSE_SPAWN_EGG.get());
				tabData.accept(RubiesandrabiesModItems.GORILLA_SPAWN_EGG.get());
				tabData.accept(RubiesandrabiesModItems.BANANA.get());
				tabData.accept(RubiesandrabiesModBlocks.RUBY_TETRAHEXAHEDRON_STAIRS.get().asItem());
				tabData.accept(RubiesandrabiesModBlocks.XRAYBLOCK.get().asItem());
				tabData.accept(RubiesandrabiesModBlocks.RUBY_TILE_STAIRS.get().asItem());
				tabData.accept(RubiesandrabiesModBlocks.RUBYTETRAHEXAHEDRONBRICKSLAB.get().asItem());
				tabData.accept(RubiesandrabiesModBlocks.RUBYTETRAHEXAHEDRONBRICKS.get().asItem());
				tabData.accept(RubiesandrabiesModBlocks.RUBYTILESLAB.get().asItem());
				tabData.accept(RubiesandrabiesModBlocks.RUBYTILES.get().asItem());
				tabData.accept(RubiesandrabiesModBlocks.RUBY_BLOCK.get().asItem());
				tabData.accept(RubiesandrabiesModBlocks.SKYFACTORY.get().asItem());
				tabData.accept(RubiesandrabiesModItems.THENIUMSWORD.get());
				tabData.accept(RubiesandrabiesModItems.URANIUM.get());
				tabData.accept(RubiesandrabiesModBlocks.THENIUM_ESSENCE_BLOCK.get().asItem());
				tabData.accept(RubiesandrabiesModItems.THENIUM_ESSENCE.get());
				tabData.accept(RubiesandrabiesModItems.GP_0_LIQUID_BUCKET.get());
				tabData.accept(RubiesandrabiesModItems.COMPRESSED_COMPRESSED_RUBY.get());
				tabData.accept(RubiesandrabiesModItems.COMPRESSED_RUBY.get());
				tabData.accept(RubiesandrabiesModItems.COMPRESSED_COMPRESSED_COMPRESSED_RUBY.get());
				tabData.accept(RubiesandrabiesModItems.GHAST_COW_SPAWN_EGG.get());
				tabData.accept(RubiesandrabiesModItems.COMPRESSED_COMPRESSED_COMPRESSED_COMPRESSED_COMPRESSED_RUBY.get());
				tabData.accept(RubiesandrabiesModItems.SKY_ESSENCE.get());
				tabData.accept(RubiesandrabiesModItems.MODIUM_ESSENCE.get());
				tabData.accept(RubiesandrabiesModItems.COMPRESSED_COMPRESSED_COMPRESSED_COMPRESSED_RUBY.get());
				tabData.accept(RubiesandrabiesModBlocks.GREGTECH.get().asItem());
				tabData.accept(RubiesandrabiesModItems.ARCHFIEND_DICE.get());
				tabData.accept(RubiesandrabiesModItems.FEMGRAM_SPAWN_EGG.get());
				tabData.accept(RubiesandrabiesModItems.ACHIEVMENTITEM.get());
			}).withSearchBar().build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SPACE = REGISTRY.register("space",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rubiesandrabies.space")).icon(() -> new ItemStack(RubiesandrabiesModItems.URANIUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RubiesandrabiesModItems.ENTER_PLANET_TEST_ITEM.get());
				tabData.accept(RubiesandrabiesModBlocks.SPACESHIP.get().asItem());
				tabData.accept(RubiesandrabiesModItems.RACIST_INGOT.get());
				tabData.accept(RubiesandrabiesModBlocks.RACIST_ORE.get().asItem());
				tabData.accept(RubiesandrabiesModItems.EXIT_PLANET_ITEM_TEST.get());
				tabData.accept(RubiesandrabiesModItems.RACIST_HELMET.get());
				tabData.accept(RubiesandrabiesModItems.RACIST_CHESTPLATE.get());
				tabData.accept(RubiesandrabiesModItems.RACIST_LEGGINGS.get());
				tabData.accept(RubiesandrabiesModItems.RACIST_BOOTS.get());
				tabData.accept(RubiesandrabiesModItems.LEAVEEVIL.get());
				tabData.accept(RubiesandrabiesModBlocks.ABYSSALL_GRASS.get().asItem());
				tabData.accept(RubiesandrabiesModItems.TESTICALS.get());
			}).withTabsBefore(RUBIES_RABIES_TAB.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ZORPINIUM_OBLIVION = REGISTRY.register("zorpinium_oblivion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rubiesandrabies.zorpinium_oblivion")).icon(() -> new ItemStack(RubiesandrabiesModBlocks.ZORPINIUM_ORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RubiesandrabiesModItems.MOLDED_ZORPINIUM.get());
				tabData.accept(RubiesandrabiesModBlocks.ZORPINIUM_ORE.get().asItem());
				tabData.accept(RubiesandrabiesModItems.UNPURIFIED_ZORPINIUM_GEM.get());
				tabData.accept(RubiesandrabiesModItems.ZORPINIUM_MOLD.get());
				tabData.accept(RubiesandrabiesModItems.ZORPINIUM_CORE.get());
				tabData.accept(RubiesandrabiesModItems.ZORPINIUMARMOR_HELMET.get());
				tabData.accept(RubiesandrabiesModItems.ZORPINIUMARMOR_CHESTPLATE.get());
				tabData.accept(RubiesandrabiesModItems.ZORPINIUMARMOR_LEGGINGS.get());
				tabData.accept(RubiesandrabiesModItems.ZORPINIUMARMOR_BOOTS.get());
				tabData.accept(RubiesandrabiesModItems.IRON_PLATE.get());
				tabData.accept(RubiesandrabiesModItems.ZORPINIUM_ROD.get());
				tabData.accept(RubiesandrabiesModBlocks.HIS_GREATNESS.get().asItem());
				tabData.accept(RubiesandrabiesModItems.ZORPINIUM_PICKAXE.get());
				tabData.accept(RubiesandrabiesModItems.PURIFIED_ZORPINIUM.get());
				tabData.accept(RubiesandrabiesModItems.ZORPINIUM_SABER.get());
			}).withSearchBar().withTabsBefore(SPACE.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(RubiesandrabiesModItems.FEMGRAMOLD_SPAWN_EGG.get());
			tabData.accept(RubiesandrabiesModItems.MEATBALL_MOOSE_SPAWN_EGG.get());
			tabData.accept(RubiesandrabiesModItems.GORILLA_SPAWN_EGG.get());
			tabData.accept(RubiesandrabiesModItems.R_HMOB_SPAWN_EGG.get());
			tabData.accept(RubiesandrabiesModItems.FEMGRAM_SPAWN_EGG.get());
			tabData.accept(RubiesandrabiesModItems.TROLLENTITY_SPAWN_EGG.get());
			tabData.accept(RubiesandrabiesModItems.TROLLENTITYARTIFICIAL_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(RubiesandrabiesModItems.BANANA.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(RubiesandrabiesModBlocks.RUBY_TETRAHEXAHEDRON_STAIRS.get().asItem());
			tabData.accept(RubiesandrabiesModBlocks.RUBY_TILE_STAIRS.get().asItem());
			tabData.accept(RubiesandrabiesModBlocks.RUBYTETRAHEXAHEDRONBRICKSLAB.get().asItem());
			tabData.accept(RubiesandrabiesModBlocks.RUBYTETRAHEXAHEDRONBRICKS.get().asItem());
			tabData.accept(RubiesandrabiesModBlocks.RUBYTILESLAB.get().asItem());
			tabData.accept(RubiesandrabiesModBlocks.RUBYTILES.get().asItem());
			tabData.accept(RubiesandrabiesModBlocks.RUBY_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RubiesandrabiesModItems.SUGARCANE_PICKAXE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(RubiesandrabiesModItems.RACIST_HELMET.get());
			tabData.accept(RubiesandrabiesModItems.RACIST_CHESTPLATE.get());
			tabData.accept(RubiesandrabiesModItems.RACIST_LEGGINGS.get());
			tabData.accept(RubiesandrabiesModItems.RACIST_BOOTS.get());
		}
	}
}