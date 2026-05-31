package com.mgmod.mgmod.init;

import com.mgmod.mgmod.MGMod;
import com.mgmod.mgmod.block.CouchBlock;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MGMod.MODID);

    // Opal Ore
    public static final DeferredBlock<DropExperienceBlock> OPAL_ORE =
            BLOCKS.register("opal_ore", () -> new DropExperienceBlock(
                    net.minecraft.util.valueproviders.UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0f, 3.0f)));

    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_OPAL_ORE =
            BLOCKS.register("deepslate_opal_ore", () -> new DropExperienceBlock(
                    net.minecraft.util.valueproviders.UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .requiresCorrectToolForDrops()
                            .strength(4.5f, 3.0f)));

    // Opal Block (for crafting)
    public static final DeferredBlock<Block> OPAL_BLOCK =
            BLOCKS.register("opal_block", () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_PINK)
                            .requiresCorrectToolForDrops()
                            .strength(5.0f, 6.0f)));

    // Red Spider Lily (flower)
    public static final DeferredBlock<FlowerBlock> RED_SPIDER_LILY =
            BLOCKS.register("red_spider_lily", () -> new FlowerBlock(
                    net.minecraft.world.effect.MobEffects.POISON, 9,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_RED)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)));

    // MG Flower Pot (decorative)
    public static final DeferredBlock<Block> MG_FLOWER_POT =
            BLOCKS.register("mg_flower_pot", () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instabreak()
                            .noOcclusion()));

    // White Wool Couch
    public static final DeferredBlock<CouchBlock> WHITE_WOOL_COUCH =
            BLOCKS.register("white_wool_couch", () -> new CouchBlock(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.WOOL)
                            .strength(0.8f)
                            .sound(SoundType.WOOL)
                            .noOcclusion()));
}
