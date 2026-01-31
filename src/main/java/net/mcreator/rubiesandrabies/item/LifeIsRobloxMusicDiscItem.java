package net.mcreator.rubiesandrabies.item;

public class LifeIsRobloxMusicDiscItem extends Item {
	public LifeIsRobloxMusicDiscItem(Item.Properties properties) {
		super(properties.stacksTo(7).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(RubiesandrabiesMod.MODID, "life_is_roblox_music_disc"))));
	}
}