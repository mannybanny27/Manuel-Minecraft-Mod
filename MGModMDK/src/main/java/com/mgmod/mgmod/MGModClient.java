package com.mgmod.mgmod;

import com.mgmod.mgmod.init.ModEntityTypes;
import net.minecraft.client.renderer.entity.NoopRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

/**
 * Client-side event handler for MGMod.
 * Registers renderers for custom entities.
 */
@EventBusSubscriber(modid = MGMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MGModClient {

    /**
     * Registers entity renderers on the client side.
     * @param event the renderer registration event
     */
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.SEAT.get(), NoopRenderer::new);
    }
}
