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

import net.mcreator.rubiesandrabies.entity.*;
import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

@EventBusSubscriber
public class RubiesandrabiesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, RubiesandrabiesMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<NowEntity>> NOW = register("now",
			EntityType.Builder.<NowEntity>of(NowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MeatballMooseEntity>> MEATBALL_MOOSE = register("meatball_moose",
			EntityType.Builder.<MeatballMooseEntity>of(MeatballMooseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<GorillaEntity>> GORILLA = register("gorilla",
			EntityType.Builder.<GorillaEntity>of(GorillaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<RHmobEntity>> R_HMOB = register("r_hmob",
			EntityType.Builder.<RHmobEntity>of(RHmobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<GhastCowEntity>> GHAST_COW = register("ghast_cow",
			EntityType.Builder.<GhastCowEntity>of(GhastCowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune()

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<FemgrambossEntity>> FEMGRAM = register("femgram",
			EntityType.Builder.<FemgrambossEntity>of(FemgrambossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(2f, 3.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<KnightOfBlunderEntity>> KNIGHT_OF_BLUNDER = register("knight_of_blunder",
			EntityType.Builder.<KnightOfBlunderEntity>of(KnightOfBlunderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DaveMustaineEntity>> DAVE_MUSTAINE = register("dave_mustaine",
			EntityType.Builder.<DaveMustaineEntity>of(DaveMustaineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<KnightOfThunderEntity>> KNIGHT_OF_THUNDER = register("knight_of_thunder",
			EntityType.Builder.<KnightOfThunderEntity>of(KnightOfThunderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TrollentityEntity>> TROLLENTITY = register("trollentity",
			EntityType.Builder.<TrollentityEntity>of(TrollentityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<TrollentityartificialEntity>> TROLLENTITYARTIFICIAL = register("trollentityartificial",
			EntityType.Builder.<TrollentityartificialEntity>of(TrollentityartificialEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheTravellerEntity>> THE_TRAVELLER = register("the_traveller",
			EntityType.Builder.<TheTravellerEntity>of(TheTravellerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 10f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(RubiesandrabiesMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		NowEntity.init(event);
		MeatballMooseEntity.init(event);
		GorillaEntity.init(event);
		RHmobEntity.init(event);
		GhastCowEntity.init(event);
		FemgrambossEntity.init(event);
		KnightOfBlunderEntity.init(event);
		DaveMustaineEntity.init(event);
		KnightOfThunderEntity.init(event);
		TrollentityEntity.init(event);
		TrollentityartificialEntity.init(event);
		TheTravellerEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NOW.get(), NowEntity.createAttributes().build());
		event.put(MEATBALL_MOOSE.get(), MeatballMooseEntity.createAttributes().build());
		event.put(GORILLA.get(), GorillaEntity.createAttributes().build());
		event.put(R_HMOB.get(), RHmobEntity.createAttributes().build());
		event.put(GHAST_COW.get(), GhastCowEntity.createAttributes().build());
		event.put(FEMGRAM.get(), FemgrambossEntity.createAttributes().build());
		event.put(KNIGHT_OF_BLUNDER.get(), KnightOfBlunderEntity.createAttributes().build());
		event.put(DAVE_MUSTAINE.get(), DaveMustaineEntity.createAttributes().build());
		event.put(KNIGHT_OF_THUNDER.get(), KnightOfThunderEntity.createAttributes().build());
		event.put(TROLLENTITY.get(), TrollentityEntity.createAttributes().build());
		event.put(TROLLENTITYARTIFICIAL.get(), TrollentityartificialEntity.createAttributes().build());
		event.put(THE_TRAVELLER.get(), TheTravellerEntity.createAttributes().build());
	}
}