package net.mcreator.rubiesandrabies.item;

public class AchievmentitemItem extends Item {
	public AchievmentitemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(1));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		AchievmentitemItemInInventoryTickProcedure.execute(entity);
		return ar;
	}
}