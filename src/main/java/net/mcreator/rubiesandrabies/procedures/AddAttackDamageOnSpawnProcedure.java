package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber
public class AddAttackDamageOnSpawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		
	}

	@SubscribeEvent
	public static void modifyAttributes(EntityAttributeModificationEvent event) {
		for (EntityType<?> type : BuiltInRegistries.ENTITY_TYPE) {
			if (type.getCategory() == MobCategory.CREATURE
			 || type.getCategory() == MobCategory.AMBIENT
			 || type.getCategory() == MobCategory.WATER_AMBIENT) {
				EntityType<? extends LivingEntity> nType = (EntityType<? extends LivingEntity>) type;
			
			    event.add(nType, Attributes.ATTACK_DAMAGE);
			}
		}
	}

}