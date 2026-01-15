package net.mcreator.rubiesandrabies.item;

public class LeaveevilItem extends Item {
	public LeaveevilItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		LeaveevilRightclickedProcedure.execute(entity);
		return ar;
	}
}