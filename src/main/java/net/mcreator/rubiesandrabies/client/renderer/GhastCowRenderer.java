package net.mcreator.rubiesandrabies.client.renderer;

public class GhastCowRenderer extends MobRenderer<GhastCowEntity, LivingEntityRenderState, ModelNow> {
	private GhastCowEntity entity = null;

	public GhastCowRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNow(context.bakeLayer(ModelNow.LAYER_LOCATION)), 2f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GhastCowEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("rubiesandrabies:textures/entities/ghastcow.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	protected boolean isShaking(LivingEntityRenderState state) {
		return true;
	}
}