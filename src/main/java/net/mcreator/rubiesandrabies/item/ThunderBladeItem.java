package net.mcreator.rubiesandrabies.item;

public class ThunderBladeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 100, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:thunder_blade_repair_items")));

	public ThunderBladeItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 23f, -2f).fireResistant());
	}
}