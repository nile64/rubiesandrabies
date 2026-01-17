package net.mcreator.rubiesandrabies.item;

public class CompressedCompressedCompressedCompressedRubyItem extends Item {
	public CompressedCompressedCompressedCompressedRubyItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}