/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
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
		}
	}
}