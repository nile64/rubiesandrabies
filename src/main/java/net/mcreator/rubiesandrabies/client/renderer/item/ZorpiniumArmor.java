package net.mcreator.rubiesandrabies.client.renderer.item;

import net.minecraft.client.model.Model;

@EventBusSubscriber(Dist.CLIENT)
public class ZorpiniumArmor {

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("rubiesandrabies:textures/models/armor/zorpiniumarmor_layer_1.png");
			}
		}, RubiesandrabiesModItems.ZORPINIUMARMOR_HELMET.get());

		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("rubiesandrabies:textures/models/armor/zorpiniumarmor_layer_1.png");
			}
		}, RubiesandrabiesModItems.ZORPINIUMARMOR_CHESTPLATE.get());

		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("rubiesandrabies:textures/models/armor/zorpiniumarmor_layer_2.png");
			}
		}, RubiesandrabiesModItems.ZORPINIUMARMOR_LEGGINGS.get());

		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("rubiesandrabies:textures/models/armor/zorpiniumarmor_layer_1.png");
			}
		}, RubiesandrabiesModItems.ZORPINIUMARMOR_BOOTS.get());
	}

}