package com.mgmod.mgmod.init;

import com.mgmod.mgmod.MGMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, MGMod.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MG_TAB =
            TABS.register("mg_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mgmod"))
                    .icon(() -> ModItems.OPAL_GEM.get().getDefaultInstance())
                    .displayItems((params, output) -> {
                        output.accept(ModItems.OPAL_GEM.get());
                        output.accept(ModItems.OPAL_ORE.get());
                        output.accept(ModItems.DEEPSLATE_OPAL_ORE.get());
                        output.accept(ModItems.OPAL_BLOCK.get());
                        output.accept(ModItems.OPAL_SWORD.get());
                        output.accept(ModItems.OPAL_PICKAXE.get());
                        output.accept(ModItems.OPAL_AXE.get());
                        output.accept(ModItems.OPAL_SHOVEL.get());
                        output.accept(ModItems.OPAL_HOE.get());
                        output.accept(ModItems.RED_SPIDER_LILY.get());
                        output.accept(ModItems.MG_FLOWER_POT.get());
                        output.accept(ModItems.WHITE_WOOL_COUCH.get());
                        output.accept(ModItems.BROWNIE.get());
                    })
                    .build());
}
