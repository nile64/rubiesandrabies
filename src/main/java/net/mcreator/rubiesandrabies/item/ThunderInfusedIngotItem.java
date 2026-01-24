package net.mcreator.rubiesandrabies.item;

public class ThunderInfusedIngotItem extends Item {
	public ThunderInfusedIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).fireResistant());
	}
}