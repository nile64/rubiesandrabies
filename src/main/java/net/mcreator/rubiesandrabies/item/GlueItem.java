package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class GlueItem extends Item {
	public GlueItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(Items.GLASS_BOTTLE);
	}
}