package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ZorpiniumSaberItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 10000, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("rubiesandrabies:zorpinium_saber_repair_items")));

	public ZorpiniumSaberItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 49f, -2f).fireResistant());
	}
}