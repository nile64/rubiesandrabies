package net.mcreator.rubiesandrabies.item;

public class CompressedCompressedCompressedRubyItem extends Item {
	public CompressedCompressedCompressedRubyItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}