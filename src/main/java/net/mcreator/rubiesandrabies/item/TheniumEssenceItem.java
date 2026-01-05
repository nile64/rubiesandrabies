package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.rubiesandrabies.procedures.TheniumEssencePlayerFinishesUsingItemProcedure;

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