package net.mcreator.rubiesandrabies.world.dimension;

@EventBusSubscriber
public class TheMoonDimension {
	@EventBusSubscriber(Dist.CLIENT)
	public static class TheMoonSpecialEffectsHandler {
		@SubscribeEvent
		public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(DimensionSpecialEffects.SkyType.OVERWORLD, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0, 0, 0);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}
			};
			event.register(ResourceLocation.parse("rubiesandrabies:the_moon"), customEffect);
		}
	}

	@SubscribeEvent
	public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getEntity();
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		if (event.getTo() == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("rubiesandrabies:the_moon"))) {
			TheMoonPlayerEntersDimensionProcedure.execute(entity);
		}
	}
}