package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UnpurifiedZorpiniumGemItem extends Item {
	public UnpurifiedZorpiniumGemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(65).fireResistant());
	}
}