package net.mcreator.rubiesandrabies.item;

public class JacksonKingVItem extends Item {
	public JacksonKingVItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		JacksonKingVRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity.getItemInHand(hand));
		return ar;
	}
}