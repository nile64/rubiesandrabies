package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

public class LifeIsRobloxMusicDiscItem extends Item {
	public LifeIsRobloxMusicDiscItem(Item.Properties properties) {
		super(properties.stacksTo(7).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(RubiesandrabiesMod.MODID, "life_is_roblox_music_disc"))));
	}
}