package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModFluids;

public class BloodItem extends BucketItem {
	public BloodItem(Item.Properties properties) {
		super(RubiesandrabiesModFluids.BLOOD.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}