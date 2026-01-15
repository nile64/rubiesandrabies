package net.mcreator.rubiesandrabies.item;

public class CompressedRubyItem extends Item {
	public CompressedRubyItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}