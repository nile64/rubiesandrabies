package net.mcreator.rubiesandrabies.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.rubiesandrabies.init.RubiesandrabiesModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements RubiesandrabiesModBiomes.RubiesandrabiesModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> rubiesandrabies_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.rubiesandrabies_dimensionTypeReference != null) {
			retval = RubiesandrabiesModBiomes.adaptSurfaceRule(retval, this.rubiesandrabies_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setrubiesandrabiesDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.rubiesandrabies_dimensionTypeReference = dimensionType;
	}
}