package net.mcreator.rubiesandrabies.client.renderer.block;

@EventBusSubscriber(Dist.CLIENT)
public class NetherthingRenderer implements BlockEntityRenderer<NetherthingBlockEntity> {

	private final CustomHierarchicalModel model;
	private final ResourceLocation texture;

	private final LivingEntityRenderState renderState;

	NetherthingRenderer(BlockEntityRendererProvider.Context context) {
		this.model = new CustomHierarchicalModel(context.bakeLayer(ModelNow.LAYER_LOCATION));
		this.texture = ResourceLocation.parse("minecraft:textures/block/netherrack.png");
		this.renderState = new LivingEntityRenderState();
	}

	private void updateRenderState(NetherthingBlockEntity blockEntity, float partialTick) {
		int tickCount = (int) blockEntity.getLevel().getGameTime();
		renderState.ageInTicks = tickCount + partialTick;
	}

	@Override
	public void render(NetherthingBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource renderer, int light, int overlayLight, Vec3 cameraPos) {
		updateRenderState(blockEntity, partialTick);
		poseStack.pushPose();
		poseStack.scale(-1, -1, 1);
		poseStack.translate(-0.5, -0.5, 0.5);
		BlockState state = blockEntity.getBlockState();
		Direction facing = state.getValue(NetherthingBlock.FACING);
		switch (facing) {
			case NORTH -> {
			}
			case EAST -> poseStack.mulPose(Axis.YP.rotationDegrees(90));
			case WEST -> poseStack.mulPose(Axis.YP.rotationDegrees(-90));
			case SOUTH -> poseStack.mulPose(Axis.YP.rotationDegrees(180));
		}
		poseStack.translate(0, -1, 0);
		VertexConsumer builder = renderer.getBuffer(RenderType.entityCutout(texture));
		model.setupBlockEntityAnim(blockEntity, renderState);
		model.renderToBuffer(poseStack, builder, light, overlayLight);
		poseStack.popPose();
	}

	@SubscribeEvent
	public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(RubiesandrabiesModBlockEntities.NETHERTHING.get(), NetherthingRenderer::new);
	}

	private static final class CustomHierarchicalModel extends ModelNow {

		public CustomHierarchicalModel(ModelPart root) {
			super(root);
		}

		public void setupBlockEntityAnim(NetherthingBlockEntity blockEntity, LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			super.setupAnim(state);
		}

	}

}