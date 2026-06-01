package com.mgmod.mgmod.init;

import com.mgmod.mgmod.MGMod;
import com.mgmod.mgmod.block.SeatEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;

/**
 * Registers all entity types for MGMod.
 */
public class ModEntityTypes {

    /** The entity type registry for this mod. */
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, MGMod.MODID);

    /** The invisible seat entity used by the couch block. */
    public static final DeferredHolder<EntityType<?>, EntityType<SeatEntity>> SEAT =
            ENTITY_TYPES.register("seat", () -> EntityType.Builder
                    .<SeatEntity>of(SeatEntity::new, MobCategory.MISC)
                    .sized(0.0f, 0.0f)
                    .build("seat"));
}
