package net.mcreator.rubiesandrabies.world.dimension;

public class QuestionMarkDimension {
	@EventBusSubscriber(Dist.CLIENT)
	public static class QuestionMarkSpecialEffectsHandler {
		@SubscribeEvent
		public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(DimensionSpecialEffects.SkyType.NONE, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return color;
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}
			};
			event.register(ResourceLocation.parse("rubiesandrabies:question_mark"), customEffect);
		}
	}
}