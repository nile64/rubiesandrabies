// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelthe_traveller<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "the_traveller"), "main");
	private final ModelPart brleg;
	private final ModelPart blleg;
	private final ModelPart frleg;
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart head;

	public Modelthe_traveller(ModelPart root) {
		this.brleg = root.getChild("brleg");
		this.blleg = root.getChild("blleg");
		this.frleg = root.getChild("frleg");
		this.bone = root.getChild("bone");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition brleg = partdefinition.addOrReplaceChild("brleg",
				CubeListBuilder.create().texOffs(16, 67)
						.addBox(-1.0F, -150.0F, -1.0F, 2.0F, 75.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(-1.0F, -75.0F, -1.0F, 2.0F, 75.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-16.0F, 24.0F, -7.0F));

		PartDefinition blleg = partdefinition.addOrReplaceChild("blleg",
				CubeListBuilder.create().texOffs(24, 67)
						.addBox(-1.0F, -150.0F, -1.0F, 2.0F, 75.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 67)
						.addBox(-1.0F, -75.0F, -1.0F, 2.0F, 75.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-16.0F, 24.0F, 7.0F));

		PartDefinition frleg = partdefinition.addOrReplaceChild("frleg",
				CubeListBuilder.create().texOffs(32, 67)
						.addBox(-1.0F, -150.0F, -1.0F, 2.0F, 75.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 67)
						.addBox(-1.0F, -75.0F, -1.0F, 2.0F, 75.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(17.0F, 24.0F, -7.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(40, 67)
						.addBox(-1.0F, -150.0F, -1.0F, 2.0F, 75.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 67)
						.addBox(-1.0F, -75.0F, -1.0F, 2.0F, 75.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(17.0F, 24.0F, 7.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-33.0F, -4.0F, -10.0F, 63.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -125.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 24)
				.addBox(-1.0F, -10.0F, -11.0F, 21.0F, 21.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offset(30.0F, -132.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		brleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		blleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}