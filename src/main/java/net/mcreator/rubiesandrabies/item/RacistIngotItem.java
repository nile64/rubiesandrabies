package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.rubiesandrabies.procedures.RacistIngotPlayeraftereatingProcedure;

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