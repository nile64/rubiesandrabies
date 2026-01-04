/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.entity.NowEntity;
import net.mcreator.rubiesandrabies.entity.MeatballMooseEntity;
import net.mcreator.rubiesandrabies.entity.FemgramEntity;
import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

@EventBusSubscriber
public class RubiesandrabiesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, RubiesandrabiesMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<FemgramEntity>> FEMGRAM = register("femgram",
			EntityType.Builder.<FemgramEntity>of(FemgramEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<NowEntity>> NOW = register("now",
			EntityType.Builder.<NowEntity>of(NowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MeatballMooseEntity>> MEATBALL_MOOSE = register("meatball_moose",
			EntityType.Builder.<MeatballMooseEntity>of(MeatballMooseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(RubiesandrabiesMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		FemgramEntity.init(event);
		NowEntity.init(event);
		MeatballMooseEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FEMGRAM.get(), FemgramEntity.createAttributes().build());
		event.put(NOW.get(), NowEntity.createAttributes().build());
		event.put(MEATBALL_MOOSE.get(), MeatballMooseEntity.createAttributes().build());
	}
}