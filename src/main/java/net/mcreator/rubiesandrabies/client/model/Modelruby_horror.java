package net.mcreator.rubiesandrabies.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelruby_horror extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("rubiesandrabies", "modelruby_horror"), "main");
	public final ModelPart leftbackwing;
	public final ModelPart leftfrontwing;
	public final ModelPart rightbackwing;
	public final ModelPart rightfrontwing;
	public final ModelPart tendrils;
	public final ModelPart tendrilleft;
	public final ModelPart tendrilback;
	public final ModelPart tendrilright;
	public final ModelPart head;
	public final ModelPart backwing;

	public Modelruby_horror(ModelPart root) {
		super(root);
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
		PartDefinition leftbackwing = partdefinition.addOrReplaceChild("leftbackwing", CubeListBuilder.create(), PartPose.offset(-2.0F, 8.0F, 3.0F));
		PartDefinition cube_r1 = leftbackwing.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 4.0F, 3.0F, 0.3623F, -0.695F, -0.0234F));
		PartDefinition leftfrontwing = partdefinition.addOrReplaceChild("leftfrontwing", CubeListBuilder.create(), PartPose.offset(-3.0F, 8.0F, 1.0F));
		PartDefinition cube_r2 = leftfrontwing.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 4.0F, 1.0F, -0.2056F, -1.0437F, 0.6121F));
		PartDefinition rightbackwing = partdefinition.addOrReplaceChild("rightbackwing", CubeListBuilder.create(), PartPose.offset(2.0F, 8.0F, 3.0F));
		PartDefinition cube_r3 = rightbackwing.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 12).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 4.0F, 3.0F, 0.3623F, 0.695F, 0.0234F));
		PartDefinition rightfrontwing = partdefinition.addOrReplaceChild("rightfrontwing", CubeListBuilder.create(), PartPose.offset(3.0F, 8.0F, 1.0F));
		PartDefinition cube_r4 = rightfrontwing.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 12).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 4.0F, 1.0F, -0.2056F, 1.0437F, -0.6121F));
		PartDefinition tendrils = partdefinition.addOrReplaceChild("tendrils", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition tendrilleft = tendrils.addOrReplaceChild("tendrilleft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = tendrilleft.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 24).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0002F, 0.0076F, 0.043F));
		PartDefinition tendrilback = tendrils.addOrReplaceChild("tendrilback", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r6 = tendrilback.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 24).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 2.0F, 0.1743F, 0.0114F, -0.0005F));
		PartDefinition tendrilright = tendrils.addOrReplaceChild("tendrilright", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r7 = tendrilright.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 24).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 2.0F, 0.0848F, 0.0226F, -0.1309F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition backwing = partdefinition.addOrReplaceChild("backwing", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r9 = backwing.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(31, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0F, 6.0F, 0.0873F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}