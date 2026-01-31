package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModMenus;
import net.mcreator.rubiesandrabies.init.RubiesandrabiesModItems;
import net.mcreator.rubiesandrabies.init.RubiesandrabiesModEntities;

public class GenerateHumanOneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RubiesandrabiesModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(1001).getItem() : ItemStack.EMPTY).getItem() == RubiesandrabiesModItems.KOOL_AID.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RubiesandrabiesModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1002).getItem() : ItemStack.EMPTY).getItem() == RubiesandrabiesModItems.KFC_BUCKET
						.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof RubiesandrabiesModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(1003).getItem() : ItemStack.EMPTY).getItem() == Items.MELON_SLICE) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = RubiesandrabiesModEntities.HOG_RIDER.get().spawn(_level, BlockPos.containing(x, y + 1, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof RubiesandrabiesModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(1001).remove(1);
				_menu.getSlots().get(1002).remove(1);
				_menu.getSlots().get(1003).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
				AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("rubiesandrabies:finger_lickin"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}