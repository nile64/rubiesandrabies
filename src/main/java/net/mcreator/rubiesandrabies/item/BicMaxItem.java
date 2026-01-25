package net.mcreator.rubiesandrabies.item;

public class BicMaxItem extends Item {
	public BicMaxItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(12).saturationModifier(0.8f).build()));
	}
}