// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmeatball_moose<T extends MeatballMoose> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "meatball_moose"), "main");
	private final ModelPart head;
	private final ModelPart lefthorn;
	private final ModelPart righthorn;
	private final ModelPart body;
	private final ModelPart leg1front;
	private final ModelPart leg3backmiddle;
	private final ModelPart leg4back;
	private final ModelPart leg2frontmiddle;

	public Modelmeatball_moose(ModelPart root) {
		this.head = root.getChild("head");
		this.lefthorn = this.head.getChild("lefthorn");
		this.righthorn = this.head.getChild("righthorn");
		this.body = root.getChild("body");
		this.leg1front = root.getChild("leg1front");
		this.leg3backmiddle = root.getChild("leg3backmiddle");
		this.leg4back = root.getChild("leg4back");
		this.leg2frontmiddle = root.getChild("leg2frontmiddle");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 107)
						.addBox(4.0F, -23.0F, -19.0F, 1.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 82)
						.addBox(5.0F, -24.0F, -20.0F, 13.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(88, 73)
						.addBox(6.0F, -23.0F, -21.0F, 11.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 36)
						.addBox(6.0F, -23.0F, -4.0F, 11.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 0)
						.addBox(6.0F, -25.0F, -19.0F, 11.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(70, 115)
						.addBox(10.0F, -26.0F, -20.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 115)
						.addBox(11.0F, -26.0F, -6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 15)
						.addBox(18.0F, -23.0F, -19.0F, 1.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-12.0F, 24.0F, 4.0F));

		PartDefinition lefthorn = head.addOrReplaceChild("lefthorn",
				CubeListBuilder.create().texOffs(58, 82)
						.addBox(-4.0F, -24.0F, -45.0F, 2.0F, 2.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(112, 97)
						.addBox(-4.0F, -25.0F, -45.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 100)
						.addBox(-4.0F, -25.0F, -42.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 103)
						.addBox(-4.0F, -25.0F, -39.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(14.0F, 0.0F, 0.0F));

		PartDefinition righthorn = head.addOrReplaceChild("righthorn",
				CubeListBuilder.create().texOffs(88, 46)
						.addBox(-4.0F, -24.0F, -45.0F, 2.0F, 2.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(112, 106)
						.addBox(-4.0F, -25.0F, -45.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 115)
						.addBox(-4.0F, -25.0F, -42.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 115)
						.addBox(-4.0F, -25.0F, -39.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -24.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(30, 107)
						.addBox(-7.0F, -14.0F, -19.0F, 9.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -15.0F, -18.0F, 11.0F, 9.0F, 37.0F, new CubeDeformation(0.0F)).texOffs(50, 109)
						.addBox(-7.0F, -14.0F, 19.0F, 9.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-7.0F, -16.0F, -17.0F, 9.0F, 1.0F, 35.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 24.0F, 4.0F));

		PartDefinition leg1front = partdefinition.addOrReplaceChild("leg1front",
				CubeListBuilder.create().texOffs(112, 79)
						.addBox(-2.0F, -6.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 109)
						.addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(102, 44)
						.addBox(-2.0F, -1.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 24.0F, -8.0F));

		PartDefinition leg3backmiddle = partdefinition.addOrReplaceChild("leg3backmiddle",
				CubeListBuilder.create().texOffs(108, 44)
						.addBox(-2.0F, -1.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(106, 109)
						.addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(112, 85)
						.addBox(-2.0F, -5.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 23.0F, 6.0F));

		PartDefinition leg4back = partdefinition.addOrReplaceChild("leg4back",
				CubeListBuilder.create().texOffs(50, 107)
						.addBox(-2.0F, -1.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 109)
						.addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(112, 91)
						.addBox(-2.0F, -5.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, 12.0F));

		PartDefinition leg2frontmiddle = partdefinition.addOrReplaceChild("leg2frontmiddle",
				CubeListBuilder.create().texOffs(96, 44)
						.addBox(-2.0F, -1.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 109)
						.addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(112, 73)
						.addBox(-2.0F, -6.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -2.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1front.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3backmiddle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4back.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2frontmiddle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}