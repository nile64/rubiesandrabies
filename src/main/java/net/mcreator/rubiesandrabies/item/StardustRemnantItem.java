package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StardustRemnantItem extends Item {
	public StardustRemnantItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).fireResistant());
	}
}