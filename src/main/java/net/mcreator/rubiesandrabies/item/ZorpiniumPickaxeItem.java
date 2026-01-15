package net.mcreator.rubiesandrabies.item;

public class ZorpiniumPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 10000, 11f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:zorpinium_pickaxe_repair_items")));

	public ZorpiniumPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 3f, -3f).fireResistant());
	}
}