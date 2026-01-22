/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.rubiesandrabies.block.entity.NetherthingBlockEntity;
import net.mcreator.rubiesandrabies.block.entity.EvilMachineBlockEntity;
import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

@EventBusSubscriber
public class RubiesandrabiesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, RubiesandrabiesMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<NetherthingBlockEntity>> NETHERTHING = register("netherthing", RubiesandrabiesModBlocks.NETHERTHING, NetherthingBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EvilMachineBlockEntity>> EVIL_MACHINE = register("evil_machine", RubiesandrabiesModBlocks.EVIL_MACHINE, EvilMachineBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NETHERTHING.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EVIL_MACHINE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, EVIL_MACHINE.get(), (blockEntity, side) -> blockEntity.getFluidTank());
	}
}