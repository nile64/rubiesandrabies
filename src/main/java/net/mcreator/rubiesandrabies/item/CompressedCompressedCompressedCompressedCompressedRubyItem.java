package net.mcreator.rubiesandrabies.item;

public class CompressedCompressedCompressedCompressedCompressedRubyItem extends Item {
	public CompressedCompressedCompressedCompressedCompressedRubyItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}