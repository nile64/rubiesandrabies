package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ZorpiniumRodItem extends Item {
	public ZorpiniumRodItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).fireResistant());
	}
}