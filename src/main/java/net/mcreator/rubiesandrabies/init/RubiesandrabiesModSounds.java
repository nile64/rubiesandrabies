/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.RubiesandrabiesMod;

public class RubiesandrabiesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, RubiesandrabiesMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> RACIST_AMBIENCE = REGISTRY.register("racist_ambience", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rubiesandrabies", "racist_ambience")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIFE_IS_ROBLOX = REGISTRY.register("life_is_roblox", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rubiesandrabies", "life_is_roblox")));
	public static final DeferredHolder<SoundEvent, SoundEvent> WHAT_TIME_IS_IT = REGISTRY.register("what_time_is_it", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rubiesandrabies", "what_time_is_it")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSTHAVEBEENTHEWIND = REGISTRY.register("musthavebeenthewind", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rubiesandrabies", "musthavebeenthewind")));
	public static final DeferredHolder<SoundEvent, SoundEvent> EVILRACISM = REGISTRY.register("evilracism", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rubiesandrabies", "evilracism")));
}