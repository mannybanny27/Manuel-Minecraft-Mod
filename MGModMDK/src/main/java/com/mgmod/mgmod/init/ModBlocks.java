package com.mgmod.mgmod.init;

import com.mgmod.mgmod.MGMod;
import com.mgmod.mgmod.block.CouchBlock;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Registers all blocks for MGMod.
 */
public class ModBlocks {

    /** The block registry for this mod. */
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MGMod.MODID);

    /** Opal ore found in stone layers. */
    public static final DeferredBlock<DropExperienceBlock> OPAL_ORE =
            BLOCKS.register("opal_ore", () -> new DropExperienceBlock(
                    net.minecraft.util.valueproviders.UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0f, 3.0f)));

    /** Opal ore found in deepslate layers. */
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_OPAL_ORE =
            BLOCKS.register("deepslate_opal_ore", () -> new DropExperienceBlock(
                    net.minecraft.util.valueproviders.UniformInt.of(3, 7),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .requiresCorrectToolForDrops()
                            .strength(4.5f, 3.0f)));

    /** A decorative block made from opal gems. */
    public static final DeferredBlock<Block> OPAL_BLOCK =
            BLOCKS.register("opal_block", () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_PINK)
                            .requiresCorrectToolForDrops()
                            .strength(5.0f, 6.0f)));

    /** A decorative red spider lily flower. */
    public static final DeferredBlock<FlowerBlock> RED_SPIDER_LILY =
            BLOCKS.register("red_spider_lily", () -> new FlowerBlock(
                    net.minecraft.world.effect.MobEffects.POISON, 9,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_RED)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)));

    /** A decorative flower pot with the initials MG. */
    public static final DeferredBlock<Block> MG_FLOWER_POT =
            BLOCKS.register("mg_flower_pot", () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instabreak()
                            .noOcclusion()));

    /** A wool couch block that players can sit on. */
    public static final DeferredBlock<CouchBlock> WHITE_WOOL_COUCH =
            BLOCKS.register("white_wool_couch", () -> new CouchBlock(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.WOOL)
                            .strength(0.8f)
                            .sound(SoundType.WOOL)
                            .noOcclusion()));
}
