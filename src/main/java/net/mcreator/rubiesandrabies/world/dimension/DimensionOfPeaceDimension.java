package net.mcreator.rubiesandrabies.world.dimension;

public class DimensionOfPeaceDimension {
	@EventBusSubscriber(Dist.CLIENT)
	public static class DimensionOfPeaceSpecialEffectsHandler {
		@SubscribeEvent
		public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(DimensionSpecialEffects.SkyType.END, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0.2, 0, 0.2);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}
			};
			event.register(ResourceLocation.parse("rubiesandrabies:dimension_of_peace"), customEffect);
		}
	}
}