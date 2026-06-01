package com.mgmod.mgmod.block;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

/**
 * An invisible entity used as a seat for the couch block.
 * Removes itself when no passengers are riding it.
 */
public class SeatEntity extends Entity {

    /**
     * Constructs a new SeatEntity.
     * @param type the entity type
     * @param level the level
     */
    public SeatEntity(EntityType<?> type, Level level) {
        super(type, level);
        this.noPhysics = true;
        this.setInvisible(true);
    }

    /**
     * Called every game tick. Removes the entity if no passengers remain.
     */
    @Override
    public void tick() {
        super.tick();
        if (!this.level().isClientSide && this.getPassengers().isEmpty()) {
            this.discard();
        }
    }

    /**
     * Defines synced data fields. None needed for this entity.
     * @param builder the synced data builder
     */
    @Override
    protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder) {}

    /**
     * Reads additional save data. Not used.
     * @param tag the compound tag
     */
    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {}

    /**
     * Writes additional save data. Not used.
     * @param tag the compound tag
     */
    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {}

    /**
     * Always returns false since this entity is invisible.
     * @param dist the squared distance
     * @return false
     */
    @Override
    public boolean shouldRenderAtSqrDistance(double dist) {
        return false;
    }
}
