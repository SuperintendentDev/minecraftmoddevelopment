// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart front_left_leg;
	private final ModelPart front_right_leg;
	private final ModelPart back_left_leg;
	private final ModelPart back_right_leg;
	private final ModelPart tail;
	private final ModelPart tail2;

	public ModelCustomModel(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.front_left_leg = root.getChild("front_left_leg");
		this.front_right_leg = root.getChild("front_right_leg");
		this.back_left_leg = root.getChild("back_left_leg");
		this.back_right_leg = root.getChild("back_right_leg");
		this.tail = root.getChild("tail");
		this.tail2 = root.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.5F, -3.0F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-1.5F, -1.02F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-2.0F, -4.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.0F, -9.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(19, -1).addBox(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, -10.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition front_left_leg = partdefinition.addOrReplaceChild("front_left_leg", CubeListBuilder.create()
				.texOffs(40, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.1F, 14.1F, -5.0F));

		PartDefinition front_right_leg = partdefinition.addOrReplaceChild("front_right_leg", CubeListBuilder.create()
				.texOffs(40, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.1F, 14.1F, -5.0F));

		PartDefinition back_left_leg = partdefinition.addOrReplaceChild("back_left_leg", CubeListBuilder.create()
				.texOffs(8, 13).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.1F, 18.0F, 5.0F));

		PartDefinition back_right_leg = partdefinition.addOrReplaceChild("back_right_leg", CubeListBuilder.create()
				.texOffs(8, 13).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.1F, 18.0F, 5.0F));

		PartDefinition tail = partdefinition
				.addOrReplaceChild("tail",
						CubeListBuilder.create().texOffs(-1, 14).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 15.5F, 8.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition tail2 = partdefinition.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(3, 14).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.5F, 16.0F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.front_right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.tail2.yRot = headPitch / (180F / (float) Math.PI);
		this.back_right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.tail.yRot = headPitch / (180F / (float) Math.PI);
		this.back_left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.front_left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}