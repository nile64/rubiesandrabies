package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class KFCBucketItem extends Item {
	public KFCBucketItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(14).saturationModifier(4f).build()));
	}
}