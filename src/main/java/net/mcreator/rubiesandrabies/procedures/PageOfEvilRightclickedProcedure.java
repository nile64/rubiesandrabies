package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.bus.api.Event;

public class PageOfEvilRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == RubiesandrabiesModItems.DELETED_MOD_ELEMENT.get()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack2 = new ItemStack(Items.ENCHANTED_BOOK).copy();
				_setstack2.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			new ItemStack(Items.ENCHANTED_BOOK).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("rubiesandrabies:deleted_mod_element"))), 1);
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("something happeneed"), false);
			}
		}
	}
}