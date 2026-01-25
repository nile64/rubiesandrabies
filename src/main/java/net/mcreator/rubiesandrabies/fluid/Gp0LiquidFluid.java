package net.mcreator.rubiesandrabies.fluid;

public abstract class Gp0LiquidFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> RubiesandrabiesModFluidTypes.GP_0_LIQUID_TYPE.get(), () -> RubiesandrabiesModFluids.GP_0_LIQUID.get(),
			() -> RubiesandrabiesModFluids.FLOWING_GP_0_LIQUID.get()).explosionResistance(100f).tickRate(1).slopeFindDistance(1).bucket(() -> RubiesandrabiesModItems.GP_0_LIQUID_BUCKET.get())
			.block(() -> (LiquidBlock) RubiesandrabiesModBlocks.GP_0_LIQUID.get());

	private Gp0LiquidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRIPPING_OBSIDIAN_TEAR;
	}

	public static class Source extends Gp0LiquidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends Gp0LiquidFluid {
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