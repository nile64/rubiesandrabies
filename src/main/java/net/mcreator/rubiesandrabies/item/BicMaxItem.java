package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BicMaxItem extends Item {
	public BicMaxItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(12).saturationModifier(14.4f).build()));
	}
}