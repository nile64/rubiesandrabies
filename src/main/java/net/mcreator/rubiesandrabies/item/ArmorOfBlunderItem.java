package net.mcreator.rubiesandrabies.item;

import java.util.Map;

public abstract class ArmorOfBlunderItem extends Item {

	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(50, Map.of(ArmorType.BOOTS, 2, ArmorType.LEGGINGS, 7, ArmorType.CHESTPLATE, 6, ArmorType.HELMET, 5, ArmorType.BODY, 6), 9,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("rubiesandrabies:knightarmor")), 4f, 0.1f, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:armor_of_blunder_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("rubiesandrabies:armor_of_blunder")));

	private ArmorOfBlunderItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends ArmorOfBlunderItem {

		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}

	}

	public static class Chestplate extends ArmorOfBlunderItem {

		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}

	}

	public static class Leggings extends ArmorOfBlunderItem {

		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}

	}

	public static class Boots extends ArmorOfBlunderItem {

		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}

	}

}