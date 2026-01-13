package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TheniumswordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2048, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:theniumsword_repair_items")));

	public TheniumswordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 7.5f, -2.8f).fireResistant());
	}
}