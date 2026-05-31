package com.mgmod.mgmod.init;

import com.mgmod.mgmod.MGMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MGMod.MODID);

    public static final DeferredItem<Item> OPAL_GEM =
            ITEMS.register("opal_gem", () -> new Item(new Item.Properties()));

    public static final DeferredItem<BlockItem> OPAL_ORE =
            ITEMS.register("opal_ore", () -> new BlockItem(ModBlocks.OPAL_ORE.get(), new Item.Properties()));

    public static final DeferredItem<BlockItem> DEEPSLATE_OPAL_ORE =
            ITEMS.register("deepslate_opal_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_OPAL_ORE.get(), new Item.Properties()));

    public static final DeferredItem<BlockItem> OPAL_BLOCK =
            ITEMS.register("opal_block", () -> new BlockItem(ModBlocks.OPAL_BLOCK.get(), new Item.Properties()));

    public static final DeferredItem<BlockItem> RED_SPIDER_LILY =
            ITEMS.register("red_spider_lily", () -> new BlockItem(ModBlocks.RED_SPIDER_LILY.get(), new Item.Properties()));

    public static final DeferredItem<BlockItem> MG_FLOWER_POT =
            ITEMS.register("mg_flower_pot", () -> new BlockItem(ModBlocks.MG_FLOWER_POT.get(), new Item.Properties()));

    public static final DeferredItem<BlockItem> WHITE_WOOL_COUCH =
            ITEMS.register("white_wool_couch", () -> new BlockItem(ModBlocks.WHITE_WOOL_COUCH.get(), new Item.Properties()));

    public static final DeferredItem<SwordItem> OPAL_SWORD =
            ITEMS.register("opal_sword", () -> new SwordItem(ModToolTiers.OPAL, new Item.Properties().attributes(
                    SwordItem.createAttributes(ModToolTiers.OPAL, 3, -2.4f))));

    public static final DeferredItem<PickaxeItem> OPAL_PICKAXE =
            ITEMS.register("opal_pickaxe", () -> new PickaxeItem(ModToolTiers.OPAL, new Item.Properties().attributes(
                    PickaxeItem.createAttributes(ModToolTiers.OPAL, 1, -2.8f))));

    public static final DeferredItem<AxeItem> OPAL_AXE =
            ITEMS.register("opal_axe", () -> new AxeItem(ModToolTiers.OPAL, new Item.Properties().attributes(
                    AxeItem.createAttributes(ModToolTiers.OPAL, 6, -3.1f))));

    public static final DeferredItem<ShovelItem> OPAL_SHOVEL =
            ITEMS.register("opal_shovel", () -> new ShovelItem(ModToolTiers.OPAL, new Item.Properties().attributes(
                    ShovelItem.createAttributes(ModToolTiers.OPAL, 1.5f, -3.0f))));

    public static final DeferredItem<HoeItem> OPAL_HOE =
            ITEMS.register("opal_hoe", () -> new HoeItem(ModToolTiers.OPAL, new Item.Properties().attributes(
                    HoeItem.createAttributes(ModToolTiers.OPAL, 0, -1.0f))));

    public static final DeferredItem<Item> BROWNIE =
            ITEMS.register("brownie", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(0.3f)
                            .build())));
}
