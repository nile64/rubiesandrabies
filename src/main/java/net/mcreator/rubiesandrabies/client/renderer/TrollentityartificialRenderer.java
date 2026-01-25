package net.mcreator.rubiesandrabies.client.renderer;

public class TrollentityartificialRenderer extends MobRenderer<TrollentityartificialEntity, LivingEntityRenderState, Modeltrollentity> {
	private TrollentityartificialEntity entity = null;

	public TrollentityartificialRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeltrollentity.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TrollentityartificialEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("rubiesandrabies:textures/entities/textur4e.png");
	}

	private static final class AnimatedModel extends Modeltrollentity {
		private TrollentityartificialEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = trollentityattackingAnimation.attacking.bake(root);
		}

		public void setEntity(TrollentityartificialEntity entity) {
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