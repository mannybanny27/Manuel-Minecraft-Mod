package com.mgmod.mgmod.init;

import com.mgmod.mgmod.MGMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFeatures {
    // Ore generation is handled via JSON data-driven biome modifiers
    // See resources/data/mgmod/worldgen/ for the JSON files
    public static void register(IEventBus bus) {
        // Registration handled by JSON files in data/mgmod/worldgen/
    }
}
