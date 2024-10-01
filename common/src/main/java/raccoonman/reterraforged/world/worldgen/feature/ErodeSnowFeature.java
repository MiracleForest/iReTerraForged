package raccoonman.reterraforged.world.worldgen.feature;

import java.util.function.Predicate;

import org.jetbrains.annotations.Nullable;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.SpreadingSnowyDirtBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import raccoonman.reterraforged.world.worldgen.GeneratorContext;
import raccoonman.reterraforged.world.worldgen.RTFRandomState;
import raccoonman.reterraforged.world.worldgen.cell.Cell;
import raccoonman.reterraforged.world.worldgen.feature.ErodeSnowFeature.Config;
import raccoonman.reterraforged.world.worldgen.heightmap.Levels;
import raccoonman.reterraforged.world.worldgen.noise.NoiseUtil;
import raccoonman.reterraforged.world.worldgen.noise.module.Noise;
import raccoonman.reterraforged.world.worldgen.noise.module.Noises;
import raccoonman.reterraforged.world.worldgen.terrain.TerrainType;
import raccoonman.reterraforged.world.worldgen.tile.Tile;

// 定义ErodeSnowFeature类,继承自Feature<Config>
public class ErodeSnowFeature extends Feature<Config> {
    // 定义雪层的最小和最大值
    private static final float MIN = min(SnowLayerBlock.LAYERS);
    private static final float MAX = max(SnowLayerBlock.LAYERS);

    // 构造函数,接受一个Config类型的Codec
    public ErodeSnowFeature(Codec<Config> codec) {
        super(codec);
    }

    // 重写place方法,实现特性的放置逻辑
    @Override
    public boolean place(FeaturePlaceContext<Config> placeContext) {
        // 获取世界生成级别
        WorldGenLevel level = placeContext.level();
        // 获取随机状态
        RandomState randomState = level.getLevel().getChunkSource().randomState();

        // 声明GeneratorContext变量
        @Nullable
        GeneratorContext generatorContext;
        // 检查随机状态是否为RTFRandomState类型,并获取生成器上下文
        if ((Object) randomState instanceof RTFRandomState rtfRandomState && (generatorContext = rtfRandomState.generatorContext()) != null) {
            // 获取区块生成器
            ChunkGenerator generator = placeContext.chunkGenerator();
            // 获取区块位置
            ChunkPos chunkPos = new ChunkPos(placeContext.origin());
            int chunkX = chunkPos.x;
            int chunkZ = chunkPos.z;
            // 获取区块访问对象
            ChunkAccess chunk = level.getChunk(chunkX, chunkZ);
            // 获取区块读取器
            Tile.Chunk tileChunk = generatorContext.cache.provideAtChunk(chunkX, chunkZ).getChunkReader(chunkX, chunkZ);
            // 获取高度图
            raccoonman.reterraforged.world.worldgen.heightmap.Heightmap heightmap = generatorContext.localHeightmap.get();
            // 获取高度级别
            Levels levels = heightmap.levels();
            // 创建噪声生成器
            Noise rand = Noises.white(heightmap.climate().randomSeed(), 1);
            // 创建可变块位置对象
            BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();
            // 获取配置
            Config config = placeContext.config();

            // 遍历区块中的所有方块
            for (int x = 0; x < 16; x++) {
                for (int z = 0; z < 16; z++) {
                    // 获取当前位置的单元格信息
                    Cell cell = tileChunk.getCell(x, z);

                    // 计算缩放后的Y坐标
                    int scaledY = levels.scale(cell.height);
                    // 获取表面Y坐标
                    int surfaceY = chunk.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, x, z);
                    // 检查是否为表面方块且高于海平面
                    if (scaledY == surfaceY && scaledY >= generator.getSeaLevel() - 1) {
                        // 计算世界坐标
                        int worldX = chunkPos.getBlockX(x);
                        int worldZ = chunkPos.getBlockZ(z);
                        pos.set(worldX, surfaceY, worldZ);

                        // 如果配置允许侵蚀
                        if (config.erode) {
                            // 计算各种噪声值和修饰符
                            float var = -ColumnDecorator.sampleNoise(worldX, worldZ, 16, 0);
                            float hNoise = rand.compute(worldX, worldZ, 4) * config.heightModifier();
                            float sNoise = rand.compute(worldX, worldZ, 5) * config.slopeModifier();
                            float vModifier = cell.terrain == TerrainType.VOLCANO ? 0.15F : 0F;
                            float height = cell.height;// + var + hNoise + vModifier;
                            float steepness = cell.gradient;// + var + sNoise + vModifier;

                            // 检查是否应该进行雪的侵蚀
                            if (snowErosion(config, worldX, worldZ, steepness, height)) {
                                Predicate<BlockState> predicate = Heightmap.Types.MOTION_BLOCKING.isOpaque();
                                // 检查上方两个方块
                                for (int dy = 2; dy > 0; dy--) {
                                    pos.setY(surfaceY + dy);
                                    BlockState state = chunk.getBlockState(pos);
                                    // 如果方块不是不透明的或者是雪,则侵蚀
                                    if (!predicate.test(state) || state.is(BlockTags.SNOW)) {
                                        erodeSnow(chunk, pos);
                                    }
                                }
                            }
                        }

                        // 如果配置允许平滑
                        if (config.smooth) {
                            pos.setY(surfaceY + 1);

                            BlockState state = chunk.getBlockState(pos);
                            // 检查上方方块,如果是空气则检查表面方块
                            if (state.isAir()) {
                                pos.setY(surfaceY);
                                state = chunk.getBlockState(pos);
                                if (state.isAir()) {
                                    continue;
                                }
                            }

                            // 如果是雪方块,则进行平滑处理
                            if (state.is(Blocks.SNOW)) {
                                smoothSnow(chunk, pos, cell, levels, 0.0F);
                            }
                        }
                    }
                }
            }
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    // 判断是否应该进行雪的侵蚀
    private static boolean snowErosion(Config config, float x, float z, float steepness, float height) {
        return (steepness * 0.55F > config.steepness());
    }

    // 侵蚀雪的方法
    private static void erodeSnow(ChunkAccess chunk, BlockPos.MutableBlockPos pos) {
        // 将当前位置设置为空气方块
        chunk.setBlockState(pos, Blocks.AIR.defaultBlockState(), false);

        // 检查下方方块
        if (pos.getY() > 0) {
            pos.setY(pos.getY() - 1);
            BlockState below = chunk.getBlockState(pos);
            // 如果下方是草方块,更新其snowy属性
            if (below.hasProperty(GrassBlock.SNOWY)) {
                chunk.setBlockState(pos, below.setValue(GrassBlock.SNOWY, false), false);
            }
        }
    }

    // 平滑雪的方法
    private static void smoothSnow(ChunkAccess chunk, BlockPos.MutableBlockPos pos, Cell cell, Levels levels, float min) {
        // 计算高度和深度
        float height = cell.height * levels.worldHeight;
        float depth = getDepth(height);
        if (depth > min) {
            // 获取雪层级别
            int level = getLevel(depth);
            BlockState layer = getState(level);
            if (layer.is(Blocks.AIR)) {
                return;
            }
            // 设置雪层
            chunk.setBlockState(pos, layer, false);

            // 修复基础方块
            fixBaseBlock(chunk, pos, layer, level);
        }
    }

    // 修复基础方块的方法
    private static void fixBaseBlock(ChunkAccess chunk, BlockPos.MutableBlockPos pos, BlockState layerMaterial, int level) {
        if (layerMaterial.is(Blocks.SNOW)) {
            pos.move(Direction.DOWN);
            BlockState belowState = chunk.getBlockState(pos);

            // 根据雪层级别修改下方方块
            if (level > 1 && belowState.getBlock() instanceof SpreadingSnowyDirtBlock) {
                chunk.setBlockState(pos, Blocks.DIRT.defaultBlockState(), false);
            } else if (level > 0) {
                chunk.setBlockState(pos, Blocks.SNOW_BLOCK.defaultBlockState(), false);
            }
        }
    }

    // 根据级别获取方块状态
    private static BlockState getState(int level) {
        if (level < MIN) {
            return Blocks.AIR.defaultBlockState();
        }
        if (level >= MAX) {
            return Blocks.SNOW_BLOCK.defaultBlockState();
        }
        return Blocks.SNOW.defaultBlockState().setValue(SnowLayerBlock.LAYERS, level);
    }

    // 获取雪层级别
    private static int getLevel(float depth) {
        if (depth > 1) {
            depth = getDepth(depth);
        } else if (depth < 0) {
            depth = 0;
        }
        return NoiseUtil.round(depth * MAX);
    }

    // 计算深度
    private static float getDepth(float height) {
        return height - (int) height;
    }

    // 获取属性的最小值
    private static int min(Property<Integer> property) {
        return property.getPossibleValues().stream().min(Integer::compareTo).orElse(0);
    }

    // 获取属性的最大值
    private static int max(Property<Integer> property) {
        return property.getPossibleValues().stream().max(Integer::compareTo).orElse(0);
    }

    // 定义Config记录类
    public record Config(float steepness, float height, boolean erode, boolean smooth, float slopeModifier,
                         float heightModifier) implements FeatureConfiguration {
        // 定义Config的Codec
        public static final Codec<Config> CODEC = RecordCodecBuilder.create(instance -> instance.group(
                Codec.FLOAT.fieldOf("steepness").forGetter(Config::steepness),
                Codec.FLOAT.fieldOf("height").forGetter(Config::height),
                Codec.BOOL.fieldOf("erode").forGetter(Config::erode),
                Codec.BOOL.fieldOf("smooth").forGetter(Config::smooth),
                Codec.FLOAT.fieldOf("slope_modifier").forGetter(Config::slopeModifier),
                Codec.FLOAT.fieldOf("height_modifier").forGetter(Config::heightModifier)
        ).apply(instance, Config::new));
    }
}