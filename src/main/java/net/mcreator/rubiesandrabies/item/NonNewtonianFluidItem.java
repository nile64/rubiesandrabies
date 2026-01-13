package net.mcreator.rubiesandrabies.item;

import net.minecraft.network.chat.Component;

public class NonNewtonianFluidItem extends BucketItem {

	public NonNewtonianFluidItem(Item.Properties properties) {
		super(RubiesandrabiesModFluids.NON_NEWTONIAN_FLUID.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}

}