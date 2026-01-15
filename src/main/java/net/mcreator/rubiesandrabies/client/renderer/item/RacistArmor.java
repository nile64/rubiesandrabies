package net.mcreator.rubiesandrabies.client.renderer.item;

import net.minecraft.client.model.Model;

@EventBusSubscriber(Dist.CLIENT)
public class RacistArmor {

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("rubiesandrabies:textures/models/armor/racistarmor_layer_1.png");
			}
		}, RubiesandrabiesModItems.RACIST_HELMET.get());

		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("rubiesandrabies:textures/models/armor/racistarmor_layer_1.png");
			}
		}, RubiesandrabiesModItems.RACIST_CHESTPLATE.get());

		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("rubiesandrabies:textures/models/armor/racistarmor_layer_2.png");
			}
		}, RubiesandrabiesModItems.RACIST_LEGGINGS.get());

		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("rubiesandrabies:textures/models/armor/racistarmor_layer_1.png");
			}
		}, RubiesandrabiesModItems.RACIST_BOOTS.get());
	}

}