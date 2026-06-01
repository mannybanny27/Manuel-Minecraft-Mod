package com.mgmod.mgmod;

import com.mgmod.mgmod.init.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

/**
 * Main mod class for MGMod.
 * Handles registration of all mod content during initialization.
 */
@Mod(MGMod.MODID)
public class MGMod {

    /** The mod ID used to identify this mod. */
    public static final String MODID = "mgmod";

    /**
     * Constructor called by NeoForge during mod loading.
     * @param modEventBus the event bus used for registration
     */
    public MGMod(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
        ModFeatures.register(modEventBus);
    }
}
