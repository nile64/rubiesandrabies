package net.mcreator.rubiesandrabies.client.fluid;

@EventBusSubscriber(Dist.CLIENT)
public class Gp0LiquidFluidExtension {
	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("rubiesandrabies:block/minecraft-cow-head-1024x1024-3108380750");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("rubiesandrabies:block/minecraft-cow-head-1024x1024-3108380750");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}

			@Override
			public Vector4f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector4f fluidFogColor) {
				return new Vector4f(1f, 0f, 0f, fluidFogColor.w);
			}

			@Override
			public void modifyFogRender(Camera camera, @Nullable FogEnvironment environment, float renderDistance, float partialTick, FogData fogData) {
				float nearDistance = fogData.environmentalStart;
				float farDistance = fogData.environmentalEnd;
				Entity entity = camera.getEntity();
				Level world = entity.level();
				fogData.environmentalStart = 0f;
				fogData.environmentalEnd = 1f;
			}

			@Override
			public int getTintColor() {
				return -16448205;
			}

			@Override
			public int getTintColor(FluidState state, BlockAndTintGetter world, BlockPos pos) {
				return Minecraft.getInstance().level.getBiome(pos).value().getWaterFogColor() | 0xFF000000;
			}
		}, RubiesandrabiesModFluidTypes.GP_0_LIQUID_TYPE.get());
	}
}