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
				tabData.accept(RubiesandrabiesModItems.FEMGRAM_SPAWN_EGG.get());
				tabData.accept(RubiesandrabiesModBlocks.BLOCK_OF_FEMGRAM.get().asItem());
				tabData.accept(RubiesandrabiesModBlocks.RUBY_BRICKS_STAIRS.get().asItem());
				tabData.accept(RubiesandrabiesModBlocks.RUBY_BRICKS_SLAB.get().asItem());
				tabData.accept(RubiesandrabiesModItems.NOW_SPAWN_EGG.get());
				tabData.accept(RubiesandrabiesModBlocks.NOWIUM_BLOCK.get().asItem());
				tabData.accept(RubiesandrabiesModItems.MEATBALL_MOOSE_SPAWN_EGG.get());
				tabData.accept(RubiesandrabiesModItems.GORILLA_SPAWN_EGG.get());
				tabData.accept(RubiesandrabiesModItems.BANANA.get());
				tabData.accept(RubiesandrabiesModItems.THENIUMSWORD.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(RubiesandrabiesModItems.FEMGRAM_SPAWN_EGG.get());
			tabData.accept(RubiesandrabiesModItems.MEATBALL_MOOSE_SPAWN_EGG.get());
			tabData.accept(RubiesandrabiesModItems.GORILLA_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(RubiesandrabiesModItems.BANANA.get());
		}
	}
}