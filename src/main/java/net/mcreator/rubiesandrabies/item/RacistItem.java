package net.mcreator.rubiesandrabies.item;

import java.util.Map;

public abstract class RacistItem extends Item {

	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(0, Map.of(ArmorType.BOOTS, 0, ArmorType.LEGGINGS, 0, ArmorType.CHESTPLATE, 0, ArmorType.HELMET, 0, ArmorType.BODY, 0), 1,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("rubiesandrabies:life_is_roblox")), 0f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:racist_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("rubiesandrabies:racist")));

	private RacistItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends RacistItem {

		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}

	}

	public static class Chestplate extends RacistItem {

		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}

	}

	public static class Leggings extends RacistItem {

		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}

	}

	public static class Boots extends RacistItem {

		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}

	}

}