package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.rubiesandrabies.procedures.TheIncidentRightclickedProcedure;

public class TheIncidentItem extends Item {
	public TheIncidentItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public ItemUseAnimation getUseAnimation(ItemStack itemstack) {
		return ItemUseAnimation.BLOCK;
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		TheIncidentRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity.getItemInHand(hand));
		return ar;
	}
}