package net.mcreator.rubiesandrabies.item;

public class KoolAidItem extends Item {
	public KoolAidItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).alwaysEdible().build(), Consumables.DEFAULT_DRINK));
	}
}