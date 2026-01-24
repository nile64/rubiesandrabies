package net.mcreator.rubiesandrabies.item;

import net.minecraft.network.chat.Component;

public class BloodItem extends BucketItem {

	public BloodItem(Item.Properties properties) {
		super(RubiesandrabiesModFluids.BLOOD.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}

}