package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.rubiesandrabies.procedures.AchievmentitemItemInInventoryTickProcedure;

public class AchievmentitemItem extends Item {
	public AchievmentitemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(1));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		AchievmentitemItemInInventoryTickProcedure.execute(entity);
		return ar;
	}
}