package net.mcreator.rubiesandrabies.item;

public class UnpurifiedZorpiniumGemItem extends Item {
	public UnpurifiedZorpiniumGemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(65).fireResistant());
	}
}