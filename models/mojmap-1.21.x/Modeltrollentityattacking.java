// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltrollentityattacking<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "trollentityattacking"), "main");
	private final ModelPart top;
	private final ModelPart bottom;

	public Modeltrollentityattacking(ModelPart root) {
		this.top = root.getChild("top");
		this.bottom = root.getChild("bottom");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top = partdefinition
				.addOrReplaceChild("top",
						CubeListBuilder.create().texOffs(0, 52).addBox(-5.0F, -12.0F, -2.0F, 10.0F, 11.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 14.0F, 7.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r1 = top.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -4.0F, -14.0F, 14.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.0F, -15.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bottom = partdefinition.addOrReplaceChild("bottom",
				CubeListBuilder.create().texOffs(86, 3)
						.addBox(-5.0F, -2.0F, -12.0F, 10.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-7.0F, 0.0F, -14.0F, 14.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, 7.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		top.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bottom.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}