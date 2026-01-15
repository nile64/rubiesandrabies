package net.mcreator.rubiesandrabies.item;

public class ZorpiniumPurifierItem extends Item {
	public ZorpiniumPurifierItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(63).fireResistant());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}
}