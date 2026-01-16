package net.mcreator.rubiesandrabies.item;

public class UraniumItem extends Item {
	public UraniumItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}