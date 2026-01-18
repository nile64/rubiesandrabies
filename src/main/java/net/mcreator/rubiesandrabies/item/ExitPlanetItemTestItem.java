package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.rubiesandrabies.procedures.ExitPlanetItemTestRightclickedProcedure;

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