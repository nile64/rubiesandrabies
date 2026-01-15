package net.mcreator.rubiesandrabies.item;

public class RacistIngotItem extends Item {
	public RacistIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).fireResistant().food((new FoodProperties.Builder()).nutrition(1).saturationModifier(-100f).alwaysEdible().build()).usingConvertsTo(Items.POISONOUS_POTATO));
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0f;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		RacistIngotPlayeraftereatingProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}
}