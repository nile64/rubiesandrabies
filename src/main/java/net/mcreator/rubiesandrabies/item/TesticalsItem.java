package net.mcreator.rubiesandrabies.item;

public class TesticalsItem extends Item {
	public TesticalsItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		TestenterabyssProcedure.execute(entity);
		return ar;
	}
}