package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntityType;

public class OverwriteAIWithRabiesAIProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity) {
			
		}
		if (entity instanceof PathfinderMob pathfinderMob) {
            pathfinderMob.goalSelector.getAvailableGoals().clear();
            pathfinderMob.targetSelector.getAvailableGoals().clear();

            pathfinderMob.goalSelector.addGoal(1, new MeleeAttackGoal(pathfinderMob, 1.3D, false));
            pathfinderMob.goalSelector.addGoal(2, new RandomStrollGoal(pathfinderMob, 1.0D));
            pathfinderMob.goalSelector.addGoal(3, new LookAtPlayerGoal(pathfinderMob, Player.class, 8.0F));
            pathfinderMob.goalSelector.addGoal(4, new RandomLookAroundGoal(pathfinderMob));

            pathfinderMob.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(pathfinderMob, Player.class, true));
        }
	}
}