package net.mcreator.rubiesandrabies.client.renderer;

public class DaveMustaineRenderer extends HumanoidMobRenderer<DaveMustaineEntity, HumanoidRenderState, HumanoidModel<HumanoidRenderState>> {
	private DaveMustaineEntity entity = null;

	public DaveMustaineRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<HumanoidRenderState>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getEquipmentRenderer()));
	}

	@Override
	public HumanoidRenderState createRenderState() {
		return new HumanoidRenderState();
	}

	@Override
	public void extractRenderState(DaveMustaineEntity entity, HumanoidRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(HumanoidRenderState state) {
		return ResourceLocation.parse("rubiesandrabies:textures/entities/dave-mustaine1.png");
	}
}