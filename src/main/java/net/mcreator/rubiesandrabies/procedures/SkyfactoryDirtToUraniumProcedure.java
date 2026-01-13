package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModMenus;
import net.mcreator.rubiesandrabies.init.RubiesandrabiesModItems;

public class SkyfactoryDirtToUraniumProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (getAmountInGUISlot(entity, 0) > 0) {
			if (entity instanceof Player _player && _player.containerMenu instanceof RubiesandrabiesModMenus.MenuAccessor _menu) {
				ItemStack _setstack2 = new ItemStack(RubiesandrabiesModItems.URANIUM.get()).copy();
				_setstack2.setCount(getAmountInGUISlot(entity, 1) + 1);
				_menu.getSlots().get(1).set(_setstack2);
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
	}

	private static int getAmountInGUISlot(Entity entity, int sltid) {
		if (entity instanceof Player player && player.containerMenu instanceof RubiesandrabiesModMenus.MenuAccessor menuAccessor) {
			ItemStack stack = menuAccessor.getSlots().get(sltid).getItem();
			if (stack != null)
				return stack.getCount();
		}
		return 0;
	}
}