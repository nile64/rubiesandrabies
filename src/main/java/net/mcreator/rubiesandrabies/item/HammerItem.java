package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class HammerItem extends Item {
	public HammerItem(Item.Properties properties) {
		super(properties.durability(16).setNoCombineRepair());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}
}