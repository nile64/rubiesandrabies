package net.mcreator.rubiesandrabies.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class GorillaEntity extends Animal {

	public final AnimationState animationState0 = new AnimationState();

	public GorillaEntity(EntityType<GorillaEntity> type, Level world) {
		super(type, world);
		xpReward = 10;
		setNoAi(false);

	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 2, false) {

			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}

		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(3, new BreedGoal(this, 1));
		this.goalSelector.addGoal(4, new TemptGoal(this, 1, Ingredient.of(RubiesandrabiesModItems.BANANA.get()), false));
		this.goalSelector.addGoal(5, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(7, new FloatGoal(this));

	}

	protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource source, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(serverLevel, source, recentlyHitIn);
		this.spawnAtLocation(serverLevel, new ItemStack(RubiesandrabiesModItems.BANANA.get()));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.polar_bear.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.polar_bear.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.end_portal.spawn"));
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource damagesource, float amount) {
		if (damagesource.getDirectEntity() instanceof AbstractArrow)
			return false;
		return super.hurtServer(level, damagesource, amount);
	}

	@Override
	public void tick() {
		super.tick();

		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
		}
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		GorillaEntity retval = RubiesandrabiesModEntities.GORILLA.get().create(serverWorld, EntitySpawnReason.BREEDING);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), EntitySpawnReason.BREEDING, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(RubiesandrabiesModItems.BANANA.get()).test(stack);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(RubiesandrabiesModEntities.GORILLA.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 40);
		builder = builder.add(Attributes.ARMOR, 5);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 10);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);

		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5);

		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 3);

		builder = builder.add(Attributes.TEMPT_RANGE, 10);

		return builder;
	}

}