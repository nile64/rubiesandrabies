package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModItems;

public class PageOfEvilRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == RubiesandrabiesModItems.PAGE_OF_EVIL.get()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack2 = new ItemStack(Items.ENCHANTED_BOOK).copy();
				_setstack2.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			new ItemStack(Items.ENCHANTED_BOOK).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("rubiesandrabies:curse_of_evil"))), 1);
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("something happeneed"), false);
			}
		}
	}
}