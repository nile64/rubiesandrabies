package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;

import net.mcreator.rubiesandrabies.procedures.NowiumEssenceRightclickedOnBlockProcedure;
import net.mcreator.rubiesandrabies.procedures.NowiumEssencePlayerFinishesUsingItemProcedure;

public class NowiumEssenceItem extends Item {
	public NowiumEssenceItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		NowiumEssencePlayerFinishesUsingItemProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		NowiumEssenceRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}