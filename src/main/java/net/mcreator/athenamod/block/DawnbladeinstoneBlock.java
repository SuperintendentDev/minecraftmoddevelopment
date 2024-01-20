
package net.mcreator.athenamod.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.athenamod.procedures.DawnbladeinstoneOnBlockRightClickedProcedure;

import java.util.List;
import java.util.Collections;

public class DawnbladeinstoneBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public DawnbladeinstoneBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(-1, 3600000).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(7, 28, 9, 9, 30, 11), box(7.5, 22, 9.5, 8.5, 28, 10.5), box(7, 21, 6.5, 9, 22, 8.5), box(7, 20, 5.5, 9, 21, 8.5), box(7, 21, 11.5, 9, 22, 13.5), box(7, 20, 11.5, 9, 21, 14.5), box(6.5, 20, 8.5, 9.5, 23, 11.5),
					box(7.5, -1, 8.5, 8.5, 20, 11.5), box(7.5, -2, 9.5, 8.5, -1, 10.5), box(3, 0, 3, 13, 2, 15), box(4, 2, 4, 12, 4, 13));
			case NORTH -> Shapes.or(box(7, 28, 5, 9, 30, 7), box(7.5, 22, 5.5, 8.5, 28, 6.5), box(7, 21, 7.5, 9, 22, 9.5), box(7, 20, 7.5, 9, 21, 10.5), box(7, 21, 2.5, 9, 22, 4.5), box(7, 20, 1.5, 9, 21, 4.5), box(6.5, 20, 4.5, 9.5, 23, 7.5),
					box(7.5, -1, 4.5, 8.5, 20, 7.5), box(7.5, -2, 5.5, 8.5, -1, 6.5), box(3, 0, 1, 13, 2, 13), box(4, 2, 3, 12, 4, 12));
			case EAST -> Shapes.or(box(9, 28, 7, 11, 30, 9), box(9.5, 22, 7.5, 10.5, 28, 8.5), box(6.5, 21, 7, 8.5, 22, 9), box(5.5, 20, 7, 8.5, 21, 9), box(11.5, 21, 7, 13.5, 22, 9), box(11.5, 20, 7, 14.5, 21, 9), box(8.5, 20, 6.5, 11.5, 23, 9.5),
					box(8.5, -1, 7.5, 11.5, 20, 8.5), box(9.5, -2, 7.5, 10.5, -1, 8.5), box(3, 0, 3, 15, 2, 13), box(4, 2, 4, 13, 4, 12));
			case WEST -> Shapes.or(box(5, 28, 7, 7, 30, 9), box(5.5, 22, 7.5, 6.5, 28, 8.5), box(7.5, 21, 7, 9.5, 22, 9), box(7.5, 20, 7, 10.5, 21, 9), box(2.5, 21, 7, 4.5, 22, 9), box(1.5, 20, 7, 4.5, 21, 9), box(4.5, 20, 6.5, 7.5, 23, 9.5),
					box(4.5, -1, 7.5, 7.5, 20, 8.5), box(5.5, -2, 7.5, 6.5, -1, 8.5), box(1, 0, 3, 13, 2, 13), box(3, 2, 4, 12, 4, 12));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		DawnbladeinstoneOnBlockRightClickedProcedure.execute(world, x, y, z);
		return InteractionResult.SUCCESS;
	}
}
