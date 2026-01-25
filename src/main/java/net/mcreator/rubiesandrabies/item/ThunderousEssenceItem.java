package net.mcreator.rubiesandrabies.item;

public class ThunderousEssenceItem extends Item {
	public ThunderousEssenceItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).fireResistant());
	}
}