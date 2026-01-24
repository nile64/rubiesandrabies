package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RandomRabiesChanceProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.isBaby()) && !(entity instanceof Player) && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("rubiesandrabies:immunetorabies"))) == false) {
			if (Mth.nextInt(RandomSource.create(), 1, 100) == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RubiesandrabiesModMobEffects.RABIES, 6000, 1, false, true));
			}
		}
	}
}