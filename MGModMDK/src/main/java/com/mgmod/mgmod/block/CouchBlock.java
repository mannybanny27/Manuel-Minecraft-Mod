package com.mgmod.mgmod.block;

import com.mgmod.mgmod.init.ModEntityTypes;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;

/**
 * A couch block that allows players to sit on it.
 * Faces a horizontal direction when placed.
 */
public class CouchBlock extends HorizontalDirectionalBlock {

    /** Codec used for serialization of this block. */
    public static final MapCodec<CouchBlock> CODEC = simpleCodec(CouchBlock::new);

    /** Hitbox shape when facing north. */
    private static final VoxelShape SHAPE_NORTH = Shapes.or(
            Block.box(0, 0, 0, 16, 8, 16),
            Block.box(0, 8, 12, 16, 16, 16)
    );

    /** Hitbox shape when facing south. */
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Block.box(0, 0, 0, 16, 8, 16),
            Block.box(0, 8, 0, 16, 16, 4)
    );

    /** Hitbox shape when facing east. */
    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Block.box(0, 0, 0, 16, 8, 16),
            Block.box(0, 8, 0, 4, 16, 16)
    );

    /** Hitbox shape when facing west. */
    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Block.box(0, 0, 0, 16, 8, 16),
            Block.box(12, 8, 0, 16, 16, 16)
    );

    /**
     * Constructs a new CouchBlock with the given properties.
     * @param properties block behavior properties
     */
    public CouchBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    /**
     * Returns the codec for this block.
     * @return the map codec
     */
    @Override
    public MapCodec<CouchBlock> codec() {
        return CODEC;
    }

    /**
     * Adds the FACING property to the block state definition.
     * @param builder the state definition builder
     */
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    /**
     * Determines the block state when placed, based on player facing direction.
     * @param context placement context
     * @return the block state to place
     */
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING,
                context.getHorizontalDirection().getOpposite());
    }

    /**
     * Returns the appropriate hitbox shape based on facing direction.
     * @param state the current block state
     * @param level the block getter
     * @param pos the block position
     * @param ctx the collision context
     * @return the voxel shape
     */
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        return switch (state.getValue(FACING)) {
            case SOUTH -> SHAPE_SOUTH;
            case EAST  -> SHAPE_EAST;
            case WEST  -> SHAPE_WEST;
            default    -> SHAPE_NORTH;
        };
    }

    /**
     * Handles right-click interaction. Spawns a seat entity and makes the player ride it.
     * @param state the block state
     * @param level the level
     * @param pos the block position
     * @param player the interacting player
     * @param hit the hit result
     * @return the interaction result
     */
    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                             Player player, BlockHitResult hit) {
        if (!level.isClientSide) {
            SeatEntity seat = new SeatEntity(ModEntityTypes.SEAT.get(), level);
            seat.setPos(pos.getX() + 0.5, pos.getY() + 0.3, pos.getZ() + 0.5);
            level.addFreshEntity(seat);
            player.startRiding(seat);
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }
}
