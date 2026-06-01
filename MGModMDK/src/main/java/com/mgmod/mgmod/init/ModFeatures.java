package com.mgmod.mgmod.init;

import com.mgmod.mgmod.MGMod;
import net.neoforged.bus.api.IEventBus;

/**
 * Handles world generation feature registration for MGMod.
 * Ore generation is handled via JSON data-driven biome modifiers.
 */
public class ModFeatures {

    /**
     * Registers world generation features.
     * Currently handled by JSON files in data/mgmod/worldgen/.
     * @param bus the mod event bus
     */
    public static void register(IEventBus bus) {
        // Registration handled by JSON files in data/mgmod/worldgen/
    }
}
