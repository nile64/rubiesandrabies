/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.rubiesandrabies.fluid.NonNewtonianFluidFluid;
import net.mcreator.rubiesandrabies.fluid.Gp0LiquidFluid;
import net.mcreator.rubiesandrabies.fluid.BloodFluid;
import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

public class RubiesandrabiesModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, RubiesandrabiesMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> NON_NEWTONIAN_FLUID = REGISTRY.register("non_newtonian_fluid", () -> new NonNewtonianFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_NON_NEWTONIAN_FLUID = REGISTRY.register("flowing_non_newtonian_fluid", () -> new NonNewtonianFluidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> GP_0_LIQUID = REGISTRY.register("gp_0_liquid", () -> new Gp0LiquidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_GP_0_LIQUID = REGISTRY.register("flowing_gp_0_liquid", () -> new Gp0LiquidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> BLOOD = REGISTRY.register("blood", () -> new BloodFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BLOOD = REGISTRY.register("flowing_blood", () -> new BloodFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(NON_NEWTONIAN_FLUID.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NON_NEWTONIAN_FLUID.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(GP_0_LIQUID.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GP_0_LIQUID.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(BLOOD.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BLOOD.get(), ChunkSectionLayer.TRANSLUCENT);
		}
	}
}