package com.mgmod.mgmod.init;

import com.mgmod.mgmod.MGMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

/**
 * Opal Tool Tier:
 * - Durability: 1561 (same as Diamond)
 * - Mining Speed: 6.0 (Iron level)
 * - Attack Damage: 2.0 (Iron level)
 * - Enchantability: 10
 * - Level: same tag as iron (can mine iron-tier blocks)
 */
public class ModToolTiers {
    public static final Tier OPAL = new SimpleTier(
            BlockTags.NEEDS_IRON_TOOL,  // mining level = iron
            1561,                        // durability = diamond
            6.0f,                        // mining speed = iron
            2.0f,                        // attack damage bonus = iron
            10,                          // enchantability
            () -> Ingredient.of(ModItems.OPAL_GEM.get())
    );
}
