// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelruby_horror<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "ruby_horror"), "main");
	private final ModelPart leftbackwing;
	private final ModelPart leftfrontwing;
	private final ModelPart rightbackwing;
	private final ModelPart rightfrontwing;
	private final ModelPart tendrils;
	private final ModelPart tendrilleft;
	private final ModelPart tendrilback;
	private final ModelPart tendrilright;
	private final ModelPart head;
	private final ModelPart backwing;

	public Modelruby_horror(ModelPart root) {
		this.leftbackwing = root.getChild("leftbackwing");
		this.leftfrontwing = root.getChild("leftfrontwing");
		this.rightbackwing = root.getChild("rightbackwing");
		this.rightfrontwing = root.getChild("rightfrontwing");
		this.tendrils = root.getChild("tendrils");
		this.tendrilleft = this.tendrils.getChild("tendrilleft");
		this.tendrilback = this.tendrils.getChild("tendrilback");
		this.tendrilright = this.tendrils.getChild("tendrilright");
		this.head = root.getChild("head");
		this.backwing = root.getChild("backwing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leftbackwing = partdefinition.addOrReplaceChild("leftbackwing", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 8.0F, 3.0F));

		PartDefinition cube_r1 = leftbackwing.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 12.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 4.0F, 3.0F, 0.3623F, -0.695F, -0.0234F));

		PartDefinition leftfrontwing = partdefinition.addOrReplaceChild("leftfrontwing", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 8.0F, 1.0F));

		PartDefinition cube_r2 = leftfrontwing.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 12.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 4.0F, 1.0F, -0.2056F, -1.0437F, 0.6121F));

		PartDefinition rightbackwing = partdefinition.addOrReplaceChild("rightbackwing", CubeListBuilder.create(),
				PartPose.offset(2.0F, 8.0F, 3.0F));

		PartDefinition cube_r3 = rightbackwing.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(12, 12).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 12.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 4.0F, 3.0F, 0.3623F, 0.695F, 0.0234F));

		PartDefinition rightfrontwing = partdefinition.addOrReplaceChild("rightfrontwing", CubeListBuilder.create(),
				PartPose.offset(3.0F, 8.0F, 1.0F));

		PartDefinition cube_r4 = rightfrontwing.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 12).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 12.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 4.0F, 1.0F, -0.2056F, 1.0437F, -0.6121F));

		PartDefinition tendrils = partdefinition.addOrReplaceChild("tendrils", CubeListBuilder.create(),
				PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition tendrilleft = tendrils.addOrReplaceChild("tendrilleft", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = tendrilleft.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(16, 24).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 13.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0002F, 0.0076F, 0.043F));

		PartDefinition tendrilback = tendrils.addOrReplaceChild("tendrilback", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tendrilback.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(21, 24).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 13.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 2.0F, 0.1743F, 0.0114F, -0.0005F));

		PartDefinition tendrilright = tendrils.addOrReplaceChild("tendrilright", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tendrilright.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(12, 24).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 13.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 2.0F, 0.0848F, 0.0226F, -0.1309F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition cube_r8 = head
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 6.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition backwing = partdefinition.addOrReplaceChild("backwing", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r9 = backwing.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(31, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 13.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0F, 6.0F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leftbackwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftfrontwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightbackwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightfrontwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tendrils.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}