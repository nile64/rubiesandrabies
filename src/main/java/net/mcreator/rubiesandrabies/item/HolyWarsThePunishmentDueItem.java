package net.mcreator.rubiesandrabies.item;

public class HolyWarsThePunishmentDueItem extends Item {
	public HolyWarsThePunishmentDueItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(RubiesandrabiesMod.MODID, "watchhimbecomeagod"))));
	}
}