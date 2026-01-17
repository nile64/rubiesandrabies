package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BananaItem extends Item {
	public BananaItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(1f).build()));
	}
}