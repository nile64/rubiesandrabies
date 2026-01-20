package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

public class HolyWarsThePunishmentDueItem extends Item {
	public HolyWarsThePunishmentDueItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(RubiesandrabiesMod.MODID, "watchhimbecomeagod"))));
	}
}