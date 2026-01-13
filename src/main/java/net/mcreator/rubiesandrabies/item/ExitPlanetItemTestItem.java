package net.mcreator.rubiesandrabies.item;

public class ExitPlanetItemTestItem extends Item {
	public ExitPlanetItemTestItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		ExitPlanetItemTestRightclickedProcedure.execute(entity);
		return ar;
	}
}