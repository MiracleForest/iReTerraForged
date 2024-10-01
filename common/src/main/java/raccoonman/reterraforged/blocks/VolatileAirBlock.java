package raccoonman.reterraforged.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.state.BlockState;

/**
 * VolatileAirBlock 类继承自 AirBlock，用于实现一个特殊空气块的行为
 * 这个类主要通过重写 updateShape 方法来实现其特定的逻辑
 */
public class VolatileAirBlock extends AirBlock {

    /**
     * 构造函数，用于初始化 VolatileAirBlock 实例
     * 
     * @param properties 块的属性，用于设置该空气块的各种特性，如硬度、亮度等
     */
    protected VolatileAirBlock(Properties properties) {
        super(properties);
    }

    /**
     * 重写 updateShape 方法，以在特定条件下更新块的状态
     * 此方法在块的邻居发生变化时被调用，用于检查和更新当前块的状态
     * 
     * @param blockState 当前块的状态，包含了所有与块相关的信息，如位置、方向等
     * @param direction 邻居块的方向，表示哪个面的邻居发生了变化
     * @param blockState2 邻居块的状态，表示变化后的邻居块状态
     * @param levelAccessor 级别访问器，用于访问世界和块的信息
     * @param blockPos 当前块的位置
     * @param blockPos2 邻居块的位置
     * @return 返回更新后的块状态，在此实现中，直接返回当前块状态而没有做任何改变
     */
    @Override
    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        return blockState;
    }
}