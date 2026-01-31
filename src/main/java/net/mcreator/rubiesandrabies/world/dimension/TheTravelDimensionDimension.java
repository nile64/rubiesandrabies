package net.mcreator.rubiesandrabies.world.dimension;

public class TheTravelDimensionDimension {
	@EventBusSubscriber(Dist.CLIENT)
	public static class TheTravelDimensionSpecialEffectsHandler {
		@SubscribeEvent
		public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(DimensionSpecialEffects.SkyType.END, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return color;
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return true;
				}
			};
			event.register(ResourceLocation.parse("rubiesandrabies:the_travel_dimension"), customEffect);
		}
	}
}