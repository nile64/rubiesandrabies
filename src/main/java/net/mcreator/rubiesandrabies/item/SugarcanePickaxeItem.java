package net.mcreator.rubiesandrabies.item;

public class SugarcanePickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 167, 25f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:sugarcane_pickaxe_repair_items")));

	public SugarcanePickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 3f, 1.5f));
	}
}