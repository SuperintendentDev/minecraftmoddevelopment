// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelrocket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "rocket"), "main");
	private final ModelPart rocket;

	public Modelrocket(ModelPart root) {
		this.rocket = root.getChild("rocket");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rocket = partdefinition.addOrReplaceChild("rocket",
				CubeListBuilder.create().texOffs(1, 1)
						.addBox(-0.5F, -3.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 18)
						.addBox(-1.0F, -4.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(10, 7)
						.addBox(0.0F, -6.0F, 2.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r1 = rocket.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(10, 7).addBox(0.0F, -3.0F, -1.0F, 0.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, 0.0F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rocket.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}