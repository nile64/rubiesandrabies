package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MoldedZorpiniumItem extends Item {
	public MoldedZorpiniumItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(63).fireResistant());
	}
}