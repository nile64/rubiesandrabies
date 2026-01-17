package net.mcreator.rubiesandrabies.item;

import net.minecraft.network.chat.Component;

public class Gp0LiquidItem extends BucketItem {

	public Gp0LiquidItem(Item.Properties properties) {
		super(RubiesandrabiesModFluids.GP_0_LIQUID.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}

}