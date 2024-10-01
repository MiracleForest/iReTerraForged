package raccoonman.reterraforged;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.resources.ResourceLocation;
import raccoonman.reterraforged.compat.terrablender.TBCompat;
import raccoonman.reterraforged.compat.terrablender.TBSurfaceRules;
import raccoonman.reterraforged.data.preset.settings.Preset;
import raccoonman.reterraforged.platform.RegistryUtil;
import raccoonman.reterraforged.registries.RTFArgumentTypeInfos;
import raccoonman.reterraforged.registries.RTFBuiltInRegistries;
import raccoonman.reterraforged.registries.RTFRegistries;
import raccoonman.reterraforged.server.commands.RTFCommands;
import raccoonman.reterraforged.world.worldgen.biome.modifier.BiomeModifier;
import raccoonman.reterraforged.world.worldgen.biome.modifier.BiomeModifiers;
import raccoonman.reterraforged.world.worldgen.densityfunction.RTFDensityFunctions;
import raccoonman.reterraforged.world.worldgen.feature.RTFFeatures;
import raccoonman.reterraforged.world.worldgen.feature.chance.RTFChanceModifiers;
import raccoonman.reterraforged.world.worldgen.feature.placement.RTFPlacementModifiers;
import raccoonman.reterraforged.world.worldgen.feature.template.decorator.TemplateDecorators;
import raccoonman.reterraforged.world.worldgen.feature.template.placement.TemplatePlacements;
import raccoonman.reterraforged.world.worldgen.floatproviders.RTFFloatProviderTypes;
import raccoonman.reterraforged.world.worldgen.heightproviders.RTFHeightProviderTypes;
import raccoonman.reterraforged.world.worldgen.noise.domain.Domains;
import raccoonman.reterraforged.world.worldgen.noise.function.CurveFunctions;
import raccoonman.reterraforged.world.worldgen.noise.module.Noise;
import raccoonman.reterraforged.world.worldgen.noise.module.Noises;
import raccoonman.reterraforged.world.worldgen.structure.rule.StructureRule;
import raccoonman.reterraforged.world.worldgen.structure.rule.StructureRules;
import raccoonman.reterraforged.world.worldgen.surface.condition.RTFSurfaceConditions;
import raccoonman.reterraforged.world.worldgen.surface.rule.LayeredSurfaceRule;
import raccoonman.reterraforged.world.worldgen.surface.rule.RTFSurfaceRules;

public class RTFCommon {
    // 定义当前模组的ID
    public static final String MOD_ID = "reterraforged";
    // 定义旧版模组的ID,可能用于兼容性目的
    public static final String LEGACY_MOD_ID = "terraforged";
    // 创建一个日志记录器实例,用于记录模组相关的日志信息
    public static final Logger LOGGER = LogManager.getLogger("ReTerraForged");

    // 初始化方法,用于引导和注册模组的各种组件
    public static void bootstrap() {
        // 初始化内置注册表,可能包含模组自定义的方块、物品等
        RTFBuiltInRegistries.bootstrap();

        // 初始化与世界生成相关的各种组件
        TemplatePlacements.bootstrap();  // 初始化模板放置
        TemplateDecorators.bootstrap();  // 初始化模板装饰器
        RTFChanceModifiers.bootstrap();  // 初始化概率修改器
        RTFPlacementModifiers.bootstrap();  // 初始化放置修改器
        RTFDensityFunctions.bootstrap();  // 初始化密度函数
        Noises.bootstrap();  // 初始化噪声生成
        Domains.bootstrap();  // 初始化域
        CurveFunctions.bootstrap();  // 初始化曲线函数
        RTFFeatures.bootstrap();  // 初始化特征
        RTFHeightProviderTypes.bootstrap();  // 初始化高度提供器类型
        RTFFloatProviderTypes.bootstrap();  // 初始化浮点数提供器类型
        RTFSurfaceRules.bootstrap();  // 初始化表面规则
        RTFSurfaceConditions.bootstrap();  // 初始化表面条件
        BiomeModifiers.bootstrap();  // 初始化生物群系修改器
        StructureRules.bootstrap();  // 初始化结构规则

        // 注册模组自定义的命令
        RTFCommands.bootstrap();
        // 注册模组自定义的命令参数类型
        RTFArgumentTypeInfos.bootstrap();

        // 检查是否启用了TerraBlender兼容性,如果启用则初始化
        if (TBCompat.isEnabled()) {
            TBCompat.bootstrap();
        }

        // 创建各种数据注册表,用于存储和管理模组的自定义数据
        RegistryUtil.createDataRegistry(RTFRegistries.NOISE, Noise.DIRECT_CODEC);  // 噪声注册表
        RegistryUtil.createDataRegistry(RTFRegistries.BIOME_MODIFIER, BiomeModifier.CODEC);  // 生物群系修改器注册表
        RegistryUtil.createDataRegistry(RTFRegistries.STRUCTURE_RULE, StructureRule.CODEC);  // 结构规则注册表
        RegistryUtil.createDataRegistry(RTFRegistries.SURFACE_LAYERS, LayeredSurfaceRule.Layer.CODEC);  // 表面层注册表
        RegistryUtil.createDataRegistry(RTFRegistries.PRESET, Preset.CODEC);  // 预设注册表
    }

    // 创建ResourceLocation的辅助方法
    // ResourceLocation在Minecraft中用于唯一标识资源（如方块、物品、音效等）
    public static ResourceLocation location(String name) {
        // 如果名称中已包含冒号,则直接创建ResourceLocation
        // 这允许使用其他模组的资源
        if (name.contains(":")) return new ResourceLocation(name);
        // 否则,使用当前模组的ID创建ResourceLocation
        return new ResourceLocation(RTFCommon.MOD_ID, name);
    }
}