package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.rubiesandrabies.procedures.LeaveevilRightclickedProcedure;

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