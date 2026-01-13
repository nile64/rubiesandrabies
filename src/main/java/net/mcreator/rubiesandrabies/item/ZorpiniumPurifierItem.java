package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ZorpiniumPurifierItem extends Item {
	public ZorpiniumPurifierItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(63).fireResistant());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}
}