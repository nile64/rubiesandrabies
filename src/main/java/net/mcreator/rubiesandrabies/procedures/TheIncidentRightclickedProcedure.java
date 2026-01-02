package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;

public class TheIncidentRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		itemstack.setCount(0);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 32, Level.ExplosionInteraction.BLOCK);
	}
}