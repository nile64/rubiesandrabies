package net.mcreator.rubiesandrabies.client.model;

import net.minecraft.util.Mth;
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
public class Modelgorilla extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("rubiesandrabies", "modelgorilla"), "main");
	public final ModelPart rightleg;
	public final ModelPart leftleg;
	public final ModelPart rightarm;
	public final ModelPart leftarm;
	public final ModelPart body;
	public final ModelPart head;

	public Modelgorilla(ModelPart root) {
		super(root);
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offset(4.0F, 14.0F, 13.0F));
		PartDefinition rightlowerleg_r1 = rightleg.addOrReplaceChild("rightlowerleg_r1",
				CubeListBuilder.create().texOffs(0, 72).addBox(-4.0F, -7.0F, -5.0F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 72).addBox(-4.0F, 3.0F, -5.0F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 7.0F, 2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition rightupperleg_r1 = rightleg.addOrReplaceChild("rightupperleg_r1", CubeListBuilder.create().texOffs(42, 71).addBox(-4.0F, -7.0F, -5.0F, 7.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 2.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offset(-5.0F, 14.0F, 13.0F));
		PartDefinition leftlowerleg_r1 = leftleg.addOrReplaceChild("leftlowerleg_r1", CubeListBuilder.create().texOffs(72, 71).addBox(-4.0F, -7.0F, -5.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 7.0F, 2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition leftupperleg_r1 = leftleg.addOrReplaceChild("leftupperleg_r1", CubeListBuilder.create().texOffs(62, 21).addBox(-4.0F, -7.0F, -5.0F, 7.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 2.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(11.0F, 4.0F, -5.0F));
		PartDefinition rightlowerarm_r1 = rightarm.addOrReplaceChild("rightlowerarm_r1", CubeListBuilder.create().texOffs(72, 89).addBox(-5.0F, -7.0F, -5.0F, 6.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 15.0F, 1.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition rightupperarm_r1 = rightarm.addOrReplaceChild("rightupperarm_r1", CubeListBuilder.create().texOffs(62, 0).addBox(-5.0F, -7.0F, -5.0F, 8.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.0F, 1.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(-11.0F, 4.0F, -5.0F));
		PartDefinition leftlowerarm_r1 = leftarm.addOrReplaceChild("leftlowerarm_r1", CubeListBuilder.create().texOffs(74, 40).addBox(-5.0F, -7.0F, -5.0F, 6.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 15.3763F, 0.5613F, 0.0436F, 0.0F, 0.0F));
		PartDefinition leftupperarm_r1 = leftarm.addOrReplaceChild("leftupperarm_r1", CubeListBuilder.create().texOffs(42, 50).addBox(-5.0F, -7.0F, -5.0F, 8.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.3763F, 0.5613F, -0.0873F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 5.0F));
		PartDefinition back_r1 = body.addOrReplaceChild("back_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.0F, -6.0F, 14.0F, 9.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 3.0F, 1.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-5.0F, -8.0F, -5.0F, 20.0F, 13.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -2.0F, -6.0F, 0.7418F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, -8.0F));
		PartDefinition mouth_r1 = head.addOrReplaceChild("mouth_r1", CubeListBuilder.create().texOffs(0, 90).addBox(0.0F, -1.0F, -6.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -4.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition mouth_r2 = head.addOrReplaceChild("mouth_r2",
				CubeListBuilder.create().texOffs(26, 90).addBox(1.0F, -1.0F, -6.0F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 50).addBox(0.0F, -6.0F, -5.0F, 10.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition skull_r1 = head.addOrReplaceChild("skull_r1", CubeListBuilder.create().texOffs(74, 60).addBox(1.0F, -8.0F, -4.0F, 8.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 1.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}