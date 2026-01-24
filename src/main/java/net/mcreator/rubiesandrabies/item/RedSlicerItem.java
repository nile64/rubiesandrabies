package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RedSlicerItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 4096, 10f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:red_slicer_repair_items")));

	public RedSlicerItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 19f, -3.2f));
	}
}