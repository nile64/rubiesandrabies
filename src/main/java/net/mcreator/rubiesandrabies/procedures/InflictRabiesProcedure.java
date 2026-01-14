package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class InflictRabiesProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity) {
		execute(null, world, damagesource, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		if (((damagesource.getEntity()) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("rubiesandrabies:touch_of_rabies")))) != 0
				|| (damagesource.getEntity()) instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(RubiesandrabiesModMobEffects.RABIES)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RubiesandrabiesModMobEffects.RABIES, 6000, 1, false, true));
		}
	}
}