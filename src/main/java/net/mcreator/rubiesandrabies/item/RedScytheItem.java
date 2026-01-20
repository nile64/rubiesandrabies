package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RedScytheItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 4096, 10f, 0, 5, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:red_scythe_repair_items")));

	public RedScytheItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 6f, -2f));
	}
}