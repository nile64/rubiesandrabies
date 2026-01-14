package net.mcreator.rubiesandrabies.item;

public class ZorpiniumSaberItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 10000, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:zorpinium_saber_repair_items")));

	public ZorpiniumSaberItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 49f, -2f).fireResistant());
	}
}