package net.mcreator.rubiesandrabies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.rubiesandrabies.entity.FemgrambossEntity;
import net.mcreator.rubiesandrabies.client.model.animations.femgramupgradedrunAnimation;
import net.mcreator.rubiesandrabies.client.model.animations.femgramupgradedpunchAnimation;
import net.mcreator.rubiesandrabies.client.model.animations.femgramupgradedkickAnimation;
import net.mcreator.rubiesandrabies.client.model.animations.femgramupgradedidleAnimation;
import net.mcreator.rubiesandrabies.client.model.Modelfemgramupgraded;

public class FemgrambossRenderer extends MobRenderer<FemgrambossEntity, LivingEntityRenderState, Modelfemgramupgraded> {
	private FemgrambossEntity entity = null;

	public FemgrambossRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelfemgramupgraded.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FemgrambossEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("rubiesandrabies:textures/entities/fgt4.png");
	}

	private static final class AnimatedModel extends Modelfemgramupgraded {
		private FemgrambossEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;
		private final KeyframeAnimation keyframeAnimation2;
		private final KeyframeAnimation keyframeAnimation3;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = femgramupgradedidleAnimation.idle.bake(root);
			this.keyframeAnimation1 = femgramupgradedrunAnimation.running.bake(root);
			this.keyframeAnimation2 = femgramupgradedpunchAnimation.punch.bake(root);
			this.keyframeAnimation3 = femgramupgradedkickAnimation.kick.bake(root);
		}

		public void setEntity(FemgrambossEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			this.keyframeAnimation1.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			this.keyframeAnimation2.apply(entity.animationState2, state.ageInTicks, 2f);
			this.keyframeAnimation3.apply(entity.animationState3, state.ageInTicks, 4f);
			super.setupAnim(state);
		}
	}
}