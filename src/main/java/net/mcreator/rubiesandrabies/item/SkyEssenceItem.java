package net.mcreator.rubiesandrabies.item;

public class SkyEssenceItem extends Item {
	public SkyEssenceItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(1).fireResistant());
	}
}