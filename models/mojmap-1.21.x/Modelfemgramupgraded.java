// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfemgramupgraded<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "femgramupgraded"), "main");
	private final ModelPart legL;
	private final ModelPart legR;
	private final ModelPart armL;
	private final ModelPart bicepL;
	private final ModelPart fistL2;
	private final ModelPart armR;
	private final ModelPart bicepR;
	private final ModelPart fistR;
	private final ModelPart head;
	private final ModelPart hair;
	private final ModelPart hairface;
	private final ModelPart hairback;
	private final ModelPart body;
	private final ModelPart chest;

	public Modelfemgramupgraded(ModelPart root) {
		this.legL = root.getChild("legL");
		this.legR = root.getChild("legR");
		this.armL = root.getChild("armL");
		this.bicepL = this.armL.getChild("bicepL");
		this.fistL2 = this.armL.getChild("fistL2");
		this.armR = root.getChild("armR");
		this.bicepR = this.armR.getChild("bicepR");
		this.fistR = this.armR.getChild("fistR");
		this.head = root.getChild("head");
		this.hair = this.head.getChild("hair");
		this.hairface = this.hair.getChild("hairface");
		this.hairback = this.hair.getChild("hairback");
		this.body = root.getChild("body");
		this.chest = this.body.getChild("chest");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition legL = partdefinition.addOrReplaceChild("legL", CubeListBuilder.create(),
				PartPose.offset(0.0F, -5.0F, -3.0F));

		PartDefinition legL_r1 = legL.addOrReplaceChild("legL_r1",
				CubeListBuilder.create().texOffs(0, 70).addBox(2.8276F, 17.7247F, -0.3571F, 8.0F, 18.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.3645F, -0.0803F, 2.9677F, -0.0151F, 3.0556F));

		PartDefinition thighL_r1 = legL.addOrReplaceChild("thighL_r1",
				CubeListBuilder.create().texOffs(56, 43).addBox(-2.1169F, 8.1101F, -16.0666F, 10.0F, 11.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.3645F, -0.0803F, -2.5813F, -0.0934F, -2.994F));

		PartDefinition legR = partdefinition.addOrReplaceChild("legR", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, -2.0F));

		PartDefinition legR_r1 = legR.addOrReplaceChild("legR_r1",
				CubeListBuilder.create().texOffs(32, 85).addBox(-10.7823F, 17.2074F, 0.1862F, 8.0F, 18.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.5953F, -0.8982F, 2.9677F, 0.0151F, -3.0556F));

		PartDefinition thighR_r1 = legR.addOrReplaceChild("thighR_r1",
				CubeListBuilder.create().texOffs(56, 64).addBox(-7.8858F, 8.0945F, -15.3152F, 10.0F, 11.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.5953F, -0.8982F, -2.5813F, 0.0934F, 2.994F));

		PartDefinition armL = partdefinition.addOrReplaceChild("armL", CubeListBuilder.create(),
				PartPose.offset(0.0F, -16.0F, -5.0F));

		PartDefinition bicepL = armL.addOrReplaceChild("bicepL", CubeListBuilder.create(),
				PartPose.offset(13.0F, 12.0F, 5.0F));

		PartDefinition cube_r1 = bicepL.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(96, 59).addBox(6.8613F, -4.2863F, -5.9386F, 6.0F, 15.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, -8.0F, -2.0F, -3.1081F, -0.0384F, -2.9221F));

		PartDefinition fistL2 = armL.addOrReplaceChild("fistL2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 10.0F, 1.0F));

		PartDefinition cube_r2 = fistL2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(98, 81).addBox(6.4775F, 0.9582F, -11.5436F, 6.0F, 15.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 2.0F, -2.0609F, -0.0384F, -2.9221F));

		PartDefinition armR = partdefinition.addOrReplaceChild("armR", CubeListBuilder.create(),
				PartPose.offset(0.0F, -16.0F, -5.0F));

		PartDefinition bicepR = armR.addOrReplaceChild("bicepR", CubeListBuilder.create(),
				PartPose.offset(0.0F, 10.0F, 1.0F));

		PartDefinition cube_r3 = bicepR.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(98, 103).addBox(-12.4775F, 0.9582F, -11.5436F, 6.0F, 15.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 2.0F, -2.0609F, 0.0384F, 2.9221F));

		PartDefinition fistR = armR.addOrReplaceChild("fistR", CubeListBuilder.create(),
				PartPose.offset(-11.0F, 10.0F, 1.0F));

		PartDefinition cube_r4 = fistR.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(64, 104).addBox(-12.8613F, -4.2863F, -5.9386F, 6.0F, 15.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -6.0F, 2.0F, -3.1081F, 0.0384F, 2.9221F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -25.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightear_r1 = head.addOrReplaceChild("rightear_r1",
				CubeListBuilder.create().texOffs(32, 111).addBox(-7.8724F, -30.1574F, -4.5653F, 6.0F, 10.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -2.0F, 2.8363F, -0.0076F, 3.0986F));

		PartDefinition leftear_r1 = head.addOrReplaceChild("leftear_r1",
				CubeListBuilder.create().texOffs(32, 70).addBox(1.8724F, -30.1574F, -4.5653F, 6.0F, 10.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -2.0F, 2.8363F, 0.0076F, -3.0986F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(0, 42).addBox(-7.0F, -22.0F, -9.0F, 14.0F, 14.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -2.0F, 2.9671F, 0.0F, 3.1416F));

		PartDefinition hair = head.addOrReplaceChild("hair", CubeListBuilder.create(),
				PartPose.offset(0.0F, 49.0F, 0.0F));

		PartDefinition hairface_r1 = hair.addOrReplaceChild("hairface_r1",
				CubeListBuilder.create().texOffs(0, 125).addBox(-15.0F, -24.4263F, 6.293F, 24.0F, 24.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -36.0F, -2.0F, 3.0107F, 0.0F, -3.1416F));

		PartDefinition hairface = hair.addOrReplaceChild("hairface", CubeListBuilder.create(),
				PartPose.offset(-2.0F, -56.0F, -9.0F));

		PartDefinition hairface_r2 = hairface.addOrReplaceChild("hairface_r2",
				CubeListBuilder.create().texOffs(46, 19).addBox(-15.0F, -24.4263F, 6.293F, 24.0F, 24.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 21.4718F, 6.7055F, 3.0107F, 0.0F, -3.1416F));

		PartDefinition hairback = hair.addOrReplaceChild("hairback", CubeListBuilder.create(),
				PartPose.offset(0.0F, -53.0F, -2.0F));

		PartDefinition hairback_r1 = hairback.addOrReplaceChild("hairback_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -23.2935F, -10.3773F, 27.0F, 42.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.206F, -0.004F, 2.9234F, 0.0F, 3.1416F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition backL_r1 = body.addOrReplaceChild("backL_r1",
				CubeListBuilder.create().texOffs(94, 19).addBox(-0.7136F, -7.5482F, -6.2402F, 8.0F, 13.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -2.0F, -3.096F, -0.0227F, 2.9685F));

		PartDefinition backR_r1 = body.addOrReplaceChild("backR_r1",
				CubeListBuilder.create().texOffs(0, 96).addBox(-7.2864F, -7.5482F, -6.2402F, 8.0F, 13.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -2.0F, -3.096F, 0.0227F, -2.9685F));

		PartDefinition waistL_r1 = body.addOrReplaceChild("waistL_r1",
				CubeListBuilder.create().texOffs(96, 40).addBox(-3.7345F, 4.5023F, -4.3205F, 9.0F, 11.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -2.0F, 2.9284F, 0.0469F, -2.9284F));

		PartDefinition waistR_r1 = body.addOrReplaceChild("waistR_r1",
				CubeListBuilder.create().texOffs(64, 85).addBox(-5.2655F, 4.5023F, -4.3205F, 9.0F, 11.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -2.0F, 2.9284F, -0.0469F, 2.9284F));

		PartDefinition neck_r1 = body.addOrReplaceChild("neck_r1",
				CubeListBuilder.create().texOffs(106, 0).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -2.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(),
				PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1",
				CubeListBuilder.create().texOffs(54, 0).addBox(-8.0F, -4.4436F, -4.4142F, 16.0F, 9.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -2.3562F, 0.0F, 3.1416F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		legL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}