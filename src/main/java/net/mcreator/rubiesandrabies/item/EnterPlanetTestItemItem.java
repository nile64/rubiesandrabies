package net.mcreator.rubiesandrabies.item;

public class EnterPlanetTestItemItem extends Item {
	public EnterPlanetTestItemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).fireResistant());
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		EnterPlanetTestItemRightclickedProcedure.execute(entity);
		return ar;
	}
}