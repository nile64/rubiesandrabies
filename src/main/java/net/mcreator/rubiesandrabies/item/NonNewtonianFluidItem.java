package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModFluids;

public class NonNewtonianFluidItem extends BucketItem {
	public NonNewtonianFluidItem(Item.Properties properties) {
		super(RubiesandrabiesModFluids.NON_NEWTONIAN_FLUID.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}