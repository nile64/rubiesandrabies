package net.mcreator.rubiesandrabies.item;

public class AtTheSpeedOfLightDiscItem extends Item {
	public AtTheSpeedOfLightDiscItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(RubiesandrabiesMod.MODID, "at_the_speed_of_light_disc"))));
	}
}