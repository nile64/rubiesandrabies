/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class RubiesandrabiesModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("rubiesandrabies:ruby_trader"))) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(RubiesandrabiesModItems.RUBY.get(), 5), new ItemStack(Blocks.DIRT), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(RubiesandrabiesModItems.RUBY.get(), 7), new ItemStack(RubiesandrabiesModItems.ACHIEVMENTITEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(RubiesandrabiesModItems.RUBY.get()), new ItemStack(Blocks.JUNGLE_SAPLING, 4), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(RubiesandrabiesModItems.RUBY.get(), 4), new ItemStack(Items.QUARTZ, 64), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(RubiesandrabiesModItems.RUBY.get(), 5), new ItemStack(RubiesandrabiesModItems.ARCHFIEND_DICE.get(), 8), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(RubiesandrabiesModItems.RUBY.get(), 8), new ItemStack(Items.DIAMOND_PICKAXE), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(RubiesandrabiesModItems.RUBY.get(), 20), new ItemStack(Items.PAPER, 5), new ItemStack(RubiesandrabiesModItems.PAGE_OF_EVIL.get()), 1, 5, 1f));
		}
	}
}