package net.mcreator.rubiesandrabies.item;

public class PageOfEvilItem extends Item {
	public PageOfEvilItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.rubiesandrabies.page_of_evil.description_0"));
		componentConsumer.accept(Component.translatable("item.rubiesandrabies.page_of_evil.description_1"));
	}
}