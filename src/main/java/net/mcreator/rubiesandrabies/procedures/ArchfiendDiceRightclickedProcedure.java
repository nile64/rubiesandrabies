package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModMobEffects;
import net.mcreator.rubiesandrabies.init.RubiesandrabiesModItems;

public class ArchfiendDiceRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double diceroll = 0;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack, 20);
		itemstack.shrink(1);
		diceroll = Mth.nextInt(RandomSource.create(), 1, 6);
		if (diceroll == 6) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(RubiesandrabiesModItems.RUBY.get()).copy();
				_setstack.setCount(3);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("6 was rolled with the Archfiend Dice").withColor(0x00ff13).withStyle(ChatFormatting.BOLD), false);
			}
		} else if (diceroll == 5) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(RubiesandrabiesModItems.RUBY.get()).copy();
				_setstack.setCount(2);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("5 was rolled with the Archfiend Dice").withColor(0x00ff2c).withStyle(ChatFormatting.BOLD), false);
			}
		} else if (diceroll == 4) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RubiesandrabiesModMobEffects.RABIES, 3600, 1));
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4 was rolled with the Archfiend Dice").withColor(0xf9ff00).withStyle(ChatFormatting.BOLD), false);
			}
		} else if (diceroll == 3) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RubiesandrabiesModMobEffects.RABIES, 200, 3));
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("3 was rolled with the Archfiend Dice").withColor(0xfffc00).withStyle(ChatFormatting.BOLD), false);
			}
		} else if (diceroll == 2) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.TNT);
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("2 was rolled with the Archfiend Dice").withColor(0xff0000).withStyle(ChatFormatting.BOLD), false);
			}
		} else if (diceroll == 1) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 10, Level.ExplosionInteraction.TNT);
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("1 was rolled with the Archfiend Dice").withColor(0xff0000).withStyle(ChatFormatting.BOLD), false);
			}
		}
	}
}