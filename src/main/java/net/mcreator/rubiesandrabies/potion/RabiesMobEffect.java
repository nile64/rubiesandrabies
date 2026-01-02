package net.mcreator.rubiesandrabies.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.rubiesandrabies.procedures.RabiesOnEffectActiveTickProcedure;
import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

public class RabiesMobEffect extends MobEffect {
	public RabiesMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, ResourceLocation.fromNamespaceAndPath(RubiesandrabiesMod.MODID, "effect.rabies_0"), 3, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		RabiesOnEffectActiveTickProcedure.execute(level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}