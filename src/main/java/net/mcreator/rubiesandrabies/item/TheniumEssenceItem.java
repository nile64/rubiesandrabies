package net.mcreator.rubiesandrabies.item;

public class TheniumEssenceItem extends Item {
	public TheniumEssenceItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		TheniumEssencePlayerFinishesUsingItemProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}
}