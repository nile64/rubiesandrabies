package net.mcreator.rubiesandrabies.fluid;

public abstract class BloodFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> RubiesandrabiesModFluidTypes.BLOOD_TYPE.get(), () -> RubiesandrabiesModFluids.BLOOD.get(), () -> RubiesandrabiesModFluids.FLOWING_BLOOD.get())
			.explosionResistance(100f).tickRate(25).bucket(() -> RubiesandrabiesModItems.BLOOD_BUCKET.get()).block(() -> (LiquidBlock) RubiesandrabiesModBlocks.BLOOD.get());

	private BloodFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BloodFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BloodFluid {
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