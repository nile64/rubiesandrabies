package net.mcreator.rubiesandrabies.item;

public class StardustPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5000, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:stardust_pickaxe_repair_items")));

	public StardustPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 3f, -3f).fireResistant());
	}
}