package net.mcreator.rubiesandrabies.item;

public class FallenOnesBroadswordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 2000, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:fallen_ones_broadsword_repair_items")));

	public FallenOnesBroadswordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 14f, -3f).fireResistant());
	}
}