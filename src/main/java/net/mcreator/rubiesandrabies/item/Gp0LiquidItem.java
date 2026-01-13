package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModFluids;

public class Gp0LiquidItem extends BucketItem {
	public Gp0LiquidItem(Item.Properties properties) {
		super(RubiesandrabiesModFluids.GP_0_LIQUID.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}
}