package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.rubiesandrabies.procedures.MakeNonNewtonianFluidSolidProcedure;
import net.mcreator.rubiesandrabies.init.RubiesandrabiesModFluids;

public class NonNewtonianFluidBlock extends LiquidBlock {
	public NonNewtonianFluidBlock(BlockBehaviour.Properties properties) {
		super(RubiesandrabiesModFluids.NON_NEWTONIAN_FLUID.get(), properties.mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier insideBlockEffectApplier) {
		super.entityInside(blockstate, world, pos, entity, insideBlockEffectApplier);
		MakeNonNewtonianFluidSolidProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}