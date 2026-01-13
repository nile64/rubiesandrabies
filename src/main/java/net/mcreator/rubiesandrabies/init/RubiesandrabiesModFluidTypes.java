/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.rubiesandrabies.fluid.types.NonNewtonianFluidFluidType;
import net.mcreator.rubiesandrabies.fluid.types.Gp0LiquidFluidType;
import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

public class RubiesandrabiesModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, RubiesandrabiesMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> NON_NEWTONIAN_FLUID_TYPE = REGISTRY.register("non_newtonian_fluid", () -> new NonNewtonianFluidFluidType());
	public static final DeferredHolder<FluidType, FluidType> GP_0_LIQUID_TYPE = REGISTRY.register("gp_0_liquid", () -> new Gp0LiquidFluidType());
}