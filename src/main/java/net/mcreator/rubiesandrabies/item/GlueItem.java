package net.mcreator.rubiesandrabies.item;

public class GlueItem extends Item {
	public GlueItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(Items.GLASS_BOTTLE);
	}
}