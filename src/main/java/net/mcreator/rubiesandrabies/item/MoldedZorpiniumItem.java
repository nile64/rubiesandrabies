package net.mcreator.rubiesandrabies.item;

public class MoldedZorpiniumItem extends Item {
	public MoldedZorpiniumItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(63).fireResistant());
	}
}