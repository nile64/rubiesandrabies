package net.mcreator.rubiesandrabies.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModItems;
import net.mcreator.rubiesandrabies.init.RubiesandrabiesModFluids;
import net.mcreator.rubiesandrabies.init.RubiesandrabiesModFluidTypes;
import net.mcreator.rubiesandrabies.init.RubiesandrabiesModBlocks;

public abstract class NonNewtonianFluidFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> RubiesandrabiesModFluidTypes.NON_NEWTONIAN_FLUID_TYPE.get(), () -> RubiesandrabiesModFluids.NON_NEWTONIAN_FLUID.get(),
			() -> RubiesandrabiesModFluids.FLOWING_NON_NEWTONIAN_FLUID.get()).explosionResistance(100f).levelDecreasePerBlock(2).slopeFindDistance(1).bucket(() -> RubiesandrabiesModItems.NON_NEWTONIAN_FLUID_BUCKET.get())
			.block(() -> (LiquidBlock) RubiesandrabiesModBlocks.NON_NEWTONIAN_FLUID.get());

	private NonNewtonianFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends NonNewtonianFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NonNewtonianFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}