package com.mgmod.mgmod.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

/**
 * Defines custom tool tiers for MGMod.
 */
public class ModToolTiers {

    /**
     * The opal tool tier.
     * Has diamond-level durability but iron-level mining speed and damage.
     * Repaired with opal gems.
     */
    public static final Tier OPAL = new SimpleTier(
            BlockTags.NEEDS_IRON_TOOL,
            1561,
            6.0f,
            2.0f,
            10,
            () -> Ingredient.of(ModItems.OPAL_GEM.get())
    );
}
