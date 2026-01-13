package net.mcreator.rubiesandrabies.client.renderer;

public class RHmobRenderer extends MobRenderer<RHmobEntity, LivingEntityRenderState, Modelruby_horror> {
	private RHmobEntity entity = null;

	public RHmobRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelruby_horror.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RHmobEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("rubiesandrabies:textures/entities/rhmob.png");
	}

	@Override
	protected boolean isShaking(LivingEntityRenderState state) {
		return true;
	}

	private static final class AnimatedModel extends Modelruby_horror {
		private RHmobEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = ruby_horrorAnimation.idle.bake(root);
		}

		public void setEntity(RHmobEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}