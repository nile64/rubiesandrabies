package net.mcreator.rubiesandrabies.item;

public class KFCBucketItem extends Item {
	public KFCBucketItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(14).saturationModifier(4f).build()));
	}
}