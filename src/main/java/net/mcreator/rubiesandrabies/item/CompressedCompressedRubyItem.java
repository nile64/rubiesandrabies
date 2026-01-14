package net.mcreator.rubiesandrabies.item;

public class CompressedCompressedRubyItem extends Item {
	public CompressedCompressedRubyItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}