package net.mcreator.rubiesandrabies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.rubiesandrabies.entity.MeatballMooseEntity;
import net.mcreator.rubiesandrabies.client.model.animations.meatball_mooseAnimation;
import net.mcreator.rubiesandrabies.client.model.Modelmeatball_moose;

public class MeatballMooseRenderer extends MobRenderer<MeatballMooseEntity, LivingEntityRenderState, Modelmeatball_moose> {
	private MeatballMooseEntity entity = null;

	public MeatballMooseRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelmeatball_moose.LAYER_LOCATION)), 2f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MeatballMooseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("rubiesandrabies:textures/entities/meatballmoosetexture.png");
	}

	private static final class AnimatedModel extends Modelmeatball_moose {
		private MeatballMooseEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = meatball_mooseAnimation.idle_anim.bake(root);
			this.keyframeAnimation1 = meatball_mooseAnimation.walk_anim.bake(root);
		}

		public void setEntity(MeatballMooseEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			this.keyframeAnimation1.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			super.setupAnim(state);
		}
	}
}