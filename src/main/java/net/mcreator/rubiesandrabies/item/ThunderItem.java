package net.mcreator.rubiesandrabies.item;

import java.util.Map;

public abstract class ThunderItem extends Item {

	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(70, Map.of(ArmorType.BOOTS, 6, ArmorType.LEGGINGS, 9, ArmorType.CHESTPLATE, 11, ArmorType.HELMET, 7, ArmorType.BODY, 11), 9,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("rubiesandrabies:thunderlive")), 20f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:thunder_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("rubiesandrabies:thunder")));

	private ThunderItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends ThunderItem {

		public Helmet(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

	}

	public static class Chestplate extends ThunderItem {

		public Chestplate(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

	}

	public static class Leggings extends ThunderItem {

		public Leggings(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

	}

	public static class Boots extends ThunderItem {

		public Boots(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

	}

}