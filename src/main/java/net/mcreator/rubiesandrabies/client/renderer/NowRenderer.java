package net.mcreator.rubiesandrabies.client.renderer;

public class NowRenderer extends MobRenderer<NowEntity, LivingEntityRenderState, ModelNow> {
	private NowEntity entity = null;

	public NowRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNow(context.bakeLayer(ModelNow.LAYER_LOCATION)), 2f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(NowEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("rubiesandrabies:textures/entities/woah.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(2f, 2f, 2f);
	}
}