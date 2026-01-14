package net.mcreator.rubiesandrabies.item;

public class EnterPlanetTestItemItem extends Item {
	public EnterPlanetTestItemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).fireResistant());
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}