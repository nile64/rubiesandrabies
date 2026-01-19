package net.mcreator.rubiesandrabies.item;

public class StardustRemnantItem extends Item {
	public StardustRemnantItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).fireResistant());
	}
}