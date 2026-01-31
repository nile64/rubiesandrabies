package net.mcreator.rubiesandrabies.client.renderer;

public class KnightOfThunderRenderer extends HumanoidMobRenderer<KnightOfThunderEntity, HumanoidRenderState, HumanoidModel<HumanoidRenderState>> {
	private KnightOfThunderEntity entity = null;

	public KnightOfThunderRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<HumanoidRenderState>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getEquipmentRenderer()));
	}

	@Override
	public HumanoidRenderState createRenderState() {
		return new HumanoidRenderState();
	}

	@Override
	public void extractRenderState(KnightOfThunderEntity entity, HumanoidRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(HumanoidRenderState state) {
		return ResourceLocation.parse("rubiesandrabies:textures/entities/b8d025746d41fc09.png");
	}
}