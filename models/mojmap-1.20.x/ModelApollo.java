// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelApollo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "apollo"), "main");
	private final ModelPart body;

	public ModelApollo(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(66, 99)
				.addBox(-5.0F, -3.5F, -9.5F, 10.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.5F, 2.5F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(2, 116).addBox(-4.0F,
				-2.0F, -4.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -9.5F));

		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(92, 3)
						.addBox(-5.0F, -1.75F, -7.125F, 10.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(106, 19)
						.addBox(-4.0F, -1.75F, -10.125F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.25F, -3.875F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(119, 38).mirror()
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.25F, -2.0F, -6.125F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(116, 29).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, -2.0F, -6.125F, 0.0F, 0.6109F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(61, 5).addBox(-4.0F, -0.25F,
				-10.0F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5F, -0.125F));

		PartDefinition tail1 = body.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(5, 90).addBox(-4.0F,
				-2.5F, 0.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 9.5F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(5, 68).addBox(-5.0F,
				-3.0F, 0.0F, 10.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(51, 87).addBox(-4.0F,
				-2.5F, 0.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(34, 51).addBox(-3.0F,
				-2.0F, 0.0F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 8.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(87, 60).addBox(-2.0F,
				-1.5F, 0.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(12, 36).addBox(-1.0F,
				-1.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.0F));

		PartDefinition fll1 = body.addOrReplaceChild("fll1", CubeListBuilder.create().texOffs(7, 63).addBox(0.0F, -1.5F,
				-1.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, -8.0F));

		PartDefinition fll2 = fll1.addOrReplaceChild("fll2", CubeListBuilder.create().texOffs(5, 27).addBox(0.0F, -1.5F,
				-1.5F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 0.0F, 0.0F));

		PartDefinition flh = fll2.addOrReplaceChild("flh", CubeListBuilder.create().texOffs(5, 14).addBox(-0.5F, -3.75F,
				-3.75F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, 0.25F, 0.25F));

		PartDefinition bll2 = body.addOrReplaceChild("bll2", CubeListBuilder.create().texOffs(28, 32).addBox(-0.25F,
				-1.5F, -1.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.25F, 2.0F, 8.0F));

		PartDefinition bll3 = bll2.addOrReplaceChild("bll3", CubeListBuilder.create().texOffs(57, 102).addBox(0.0F,
				-1.5F, -1.5F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(4.75F, 0.0F, 0.0F));

		PartDefinition blh = bll3.addOrReplaceChild("blh", CubeListBuilder.create().texOffs(66, 36).addBox(0.0F, -3.75F,
				-3.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 0.25F, 0.0F));

		PartDefinition frl1 = body.addOrReplaceChild("frl1", CubeListBuilder.create().texOffs(3, 3).addBox(-5.0F, -1.5F,
				-1.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, -8.0F));

		PartDefinition frl2 = frl1.addOrReplaceChild("frl2", CubeListBuilder.create().texOffs(106, 56).addBox(-7.0F,
				-1.5F, -1.5F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition frh = frl2.addOrReplaceChild("frh", CubeListBuilder.create().texOffs(104, 66).addBox(-1.0F,
				-3.5F, -3.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 0.0F, 0.0F));

		PartDefinition brl1 = body.addOrReplaceChild("brl1", CubeListBuilder.create().texOffs(78, 46).addBox(-5.0F,
				-1.5F, -1.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 8.0F));

		PartDefinition brl2 = brl1.addOrReplaceChild("brl2", CubeListBuilder.create().texOffs(43, 15).addBox(-7.0F,
				-1.5F, -1.5F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition brh = brl2.addOrReplaceChild("brh", CubeListBuilder.create().texOffs(24, 8).addBox(-1.0F, -3.25F,
				-3.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -0.25F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}