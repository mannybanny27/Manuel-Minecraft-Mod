package com.mgmod.mgmod;

import com.mgmod.mgmod.init.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(MGMod.MODID)
public class MGMod {
    public static final String MODID = "mgmod";

    public MGMod(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
        ModFeatures.register(modEventBus);
    }
}
