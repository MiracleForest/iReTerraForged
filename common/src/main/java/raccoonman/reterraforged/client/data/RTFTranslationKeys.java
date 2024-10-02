package raccoonman.reterraforged.client.data;

import raccoonman.reterraforged.RTFCommon;

/**
 * RTFTranslationKeys类包含了用于ReTerraForged模组所有可翻译文本的键值。
 * 这些键值对应于模组的用户界面元素，如按钮、标签、滑块和预设等的文本。
 * 通过使用resolve方法，每个键值与ReTerraForged模组的ID相结合，形成完整的资源键，
 * 这些资源键用于在模组的翻译文件中查找对应的本地化文本。
 */
public class RTFTranslationKeys {
    // 元数据描述的键值
    public static final String METADATA_DESCRIPTION = resolve("metadata.description");
    // 预设元数据描述的键值
    public static final String PRESET_METADATA_DESCRIPTION = resolve("preset.metadata.description");
    // 泥沼元数据描述的键值
    public static final String MUD_SWAMPS_METADATA_DESCRIPTION = resolve("mudSwamps.metadata.description");
    // 无错误信息时的占位符键值
    public static final String NO_ERROR_MESSAGE = resolve("error.noMessage");

    // GUI预设选择输入提示的键值
    public static final String GUI_INPUT_PROMPT = resolve("gui.selectPreset.inputPrompt");

    // GUI缺失旧版预设的提示信息键值
    public static final String GUI_SELECT_PRESET_MISSING_LEGACY_PRESETS = resolve("gui.selectPreset.missingLegacyPresets");
    // GUI预设选择标题的键值
    public static final String GUI_SELECT_PRESET_TITLE = resolve("gui.selectPreset.title");
    // GUI默认预设名称的键值
    public static final String GUI_DEFAULT_PRESET_NAME = resolve("gui.preset.default.name");
    // GUI默认旧版预设名称的键值
    public static final String GUI_DEFAULT_LEGACY_PRESET_NAME = resolve("gui.preset.legacyDefault.name");
    // GUI美丽预设名称的键值
    public static final String GUI_BEAUTIFUL_PRESET_NAME = resolve("gui.preset.beautiful.name");
    // GUI巨大生态预设名称的键值
    public static final String GUI_HUGE_BIOMES_PRESET_NAME = resolve("gui.preset.hugeBiomes.name");
    // GUI精简预设名称的键值
    public static final String GUI_LITE_PRESET_NAME = resolve("gui.preset.lite.name");
    // GUI接近原版风格的预设名称键值
    public static final String GUI_VANILLAISH_PRESET_NAME = resolve("gui.preset.vanillaish.name");
    // GUI世界设置标题的键值
    public static final String GUI_WORLD_SETTINGS_TITLE = resolve("gui.worldSettings.title");
    // GUI表面设置标题的键值
    public static final String GUI_SURFACE_SETTINGS_TITLE = resolve("gui.surfaceSettings.title");
    // GUI洞穴设置标题的键值
    public static final String GUI_CAVE_SETTINGS_TITLE = resolve("gui.caveSettings.title");
    // GUI气候设置标题的键值
    public static final String GUI_CLIMATE_SETTINGS_TITLE = resolve("gui.climateSettings.title");
    // GUI地形设置标题的键值
    public static final String GUI_TERRAIN_SETTINGS_TITLE = resolve("gui.terrainSettings.title");
    // GUI河流设置标题的键值
    public static final String GUI_RIVER_SETTINGS_TITLE = resolve("gui.riverSettings.title");
    // GUI筛选设置标题的键值
    public static final String GUI_FILTER_SETTINGS_TITLE = resolve("gui.filterSettings.title");
    // GUI结构设置标题的键值
    public static final String GUI_STRUCTURE_SETTINGS_TITLE = resolve("gui.structureSettings.title");
    // GUI杂项设置标题的键值
    public static final String GUI_MISCELLANEOUS_SETTINGS_TITLE = resolve("gui.miscellaneousSettings.title");

    // 真按钮文本的键值
    public static final String GUI_BUTTON_TRUE = resolve("gui.button.true");
    // 假按钮文本的键值
    public static final String GUI_BUTTON_FALSE = resolve("gui.button.false");
    // 创建按钮文本的键值
    public static final String GUI_BUTTON_CREATE = resolve("gui.button.create");
    // 复制按钮文本的键值
    public static final String GUI_BUTTON_COPY = resolve("gui.button.copy");
    // 删除按钮文本的键值
    public static final String GUI_BUTTON_DELETE = resolve("gui.button.delete");
    // 打开预设文件夹按钮文本的键值
    public static final String GUI_BUTTON_OPEN_PRESET_FOLDER = resolve("gui.button.openPresetFolder");
    // 打开数据包文件夹按钮文本的键值
    public static final String GUI_BUTTON_OPEN_EXPORT_FOLDER = resolve("gui.button.openDatapackFolder");
    // 导出为数据包按钮文本的键值
    public static final String GUI_BUTTON_EXPORT_AS_DATAPACK = resolve("gui.button.export");
    // 导出成功按钮文本的键值
    public static final String GUI_BUTTON_EXPORT_SUCCESS = resolve("gui.button.export.success");
    // 种子按钮文本的键值
    public static final String GUI_BUTTON_SEED = resolve("gui.button.seed");
    // 大陆类型按钮文本的键值
    public static final String GUI_BUTTON_CONTINENT_TYPE = resolve("gui.button.continentType");
    // 大陆形状按钮文本的键值
    public static final String GUI_BUTTON_CONTINENT_SHAPE = resolve("gui.button.continentShape");
    // 生成类型按钮文本的键值
    public static final String GUI_BUTTON_SPAWN_TYPE = resolve("gui.button.spawnType");
    // 大型矿脉按钮文本的键值
    public static final String GUI_BUTTON_LARGE_ORE_VEINS = resolve("gui.button.largeOreVeins");
    // 旧版雕刻器分布按钮文本的键值
    public static final String GUI_BUTTON_LEGACY_CARVER_DISTRIBUTION = resolve("gui.button.legacyCarverDistribution");
    // 气候种子偏移按钮文本的键值
    public static final String GUI_BUTTON_CLIMATE_SEED_OFFSET = resolve("gui.button.climateSeedOffset");
    // 生态边缘类型按钮文本的键值
    public static final String GUI_BUTTON_BIOME_EDGE_TYPE = resolve("gui.button.biomeEdgeType");
    // 地形种子偏移按钮文本的键值
    public static final String GUI_BUTTON_TERRAIN_SEED_OFFSET = resolve("gui.button.terrainSeedOffset");
    // 华丽山脉按钮文本的键值
    public static final String GUI_BUTTON_FANCY_MOUNTAINS = resolve("gui.button.fancyMountains");
    // 河流种子偏移按钮文本的键值
    public static final String GUI_BUTTON_RIVER_SEED_OFFSET = resolve("gui.button.riverSeedOffset");
    // 盐按钮文本的键值
    public static final String GUI_BUTTON_SALT = resolve("gui.button.salt");
    // 禁用按钮文本的键值
    public static final String GUI_BUTTON_DISABLED = resolve("gui.button.disabled");
    // 平滑层装饰按钮文本的键值
    public static final String GUI_BUTTON_SMOOTH_LAYER_DECORATOR = resolve("gui.button.smoothLayerDecorator");
    // 地层装饰按钮文本的键值
    public static final String GUI_BUTTON_STRATA_DECORATOR = resolve("gui.button.strataDecorator");
    // 仅矿石兼容石材按钮文本的键值
    public static final String GUI_BUTTON_ORE_COMPATIBLE_STONE_ONLY = resolve("gui.button.oreCompatibleStoneOnly");
    // 侵蚀装饰按钮文本的键值
    public static final String GUI_BUTTON_EROSION_DECORATOR = resolve("gui.button.erosionDecorator");
    // 普通石材侵蚀按钮文本的键值
    public static final String GUI_BUTTON_PLAIN_STONE_EROSION = resolve("gui.button.stoneErosion");
    // 自然降雪装饰按钮文本的键值
    public static final String GUI_BUTTON_NATURAL_SNOW_DECORATOR = resolve("gui.button.naturalSnowDecorator");
    // 自定义生态特征按钮文本的键值
    public static final String GUI_BUTTON_CUSTOM_BIOME_FEATURES = resolve("gui.button.customBiomeFeatures");
    // 原版泉水按钮文本的键值
    public static final String GUI_BUTTON_VANILLA_SPRINGS = resolve("gui.button.vanillaSprings");
    // 原版熔岩湖按钮文本的键值
    public static final String GUI_BUTTON_VANILLA_LAVA_LAKES = resolve("gui.button.vanillaLavaLakes");
    // 原版熔岩泉按钮文本的键值
    public static final String GUI_BUTTON_VANILLA_LAVA_SPRINGS = resolve("gui.button.vanillaLavaSprings");

    // 缩放滑块键值
    public static final String GUI_SLIDER_ZOOM = resolve("gui.slider.zoom");
    // 大陆规模滑块键值
    public static final String GUI_SLIDER_CONTINENT_SCALE = resolve("gui.slider.continentScale");
    // 大陆抖动滑块键值
    public static final String GUI_SLIDER_CONTINENT_JITTER = resolve("gui.slider.continentJitter");
    // 大陆跳过滑块键值
    public static final String GUI_SLIDER_CONTINENT_SKIPPING = resolve("gui.slider.continentSkipping");
    // 大陆大小变化滑块键值
    public static final String GUI_SLIDER_CONTINENT_SIZE_VARIANCE = resolve("gui.slider.continentSizeVariance");
    // 大陆噪声八度滑块键值
    public static final String GUI_SLIDER_CONTINENT_NOISE_OCTAVES = resolve("gui.slider.continentNoiseOctaves");
    // 大陆噪声增益滑块键值
    public static final String GUI_SLIDER_CONTINENT_NOISE_GAIN = resolve("gui.slider.continentNoiseGain");
    // 大陆噪声频率滑块键值
    public static final String GUI_SLIDER_CONTINENT_NOISE_LACUNARITY = resolve("gui.slider.continentNoiseLacunarity");
    // 岛屿内陆滑块键值
    public static final String GUI_SLIDER_ISLAND_INLAND = resolve("gui.slider.islandInland");
    // 岛屿海岸滑块键值
    public static final String GUI_SLIDER_ISLAND_COAST = resolve("gui.slider.islandCoast");
    // 深海滑块键值
    public static final String GUI_SLIDER_DEEP_OCEAN = resolve("gui.slider.deepOcean");
    // 浅海滑块键值
    public static final String GUI_SLIDER_SHALLOW_OCEAN = resolve("gui.slider.shallowOcean");
    // 海滩滑块键值
    public static final String GUI_SLIDER_BEACH = resolve("gui.slider.beach");
    // 海岸滑块键值
    public static final String GUI_SLIDER_COAST = resolve("gui.slider.coast");
    // 近内陆滑块键值
    public static final String GUI_SLIDER_NEAR_INLAND = resolve("gui.slider.nearInland");
    // 中内陆滑块键值
    public static final String GUI_SLIDER_MID_INLAND = resolve("gui.slider.midInland");
    // 远内陆滑块键值
    public static final String GUI_SLIDER_FAR_INLAND = resolve("gui.slider.farInland");
    // 世界高度滑块键值
    public static final String GUI_SLIDER_WORLD_HEIGHT = resolve("gui.slider.worldHeight");
    // 世界深度滑块键值
    public static final String GUI_SLIDER_WORLD_DEPTH = resolve("gui.slider.worldDepth");
    // 海平面滑块键值
    public static final String GUI_SLIDER_SEA_LEVEL = resolve("gui.slider.seaLevel");
    // 熔岩层滑块键值
    public static final String GUI_SLIDER_LAVA_LEVEL = resolve("gui.slider.lavaLevel");
    // 岩石变化滑块键值
    public static final String GUI_SLIDER_ROCK_VARIANCE = resolve("gui.slider.rockVariance");
    // 岩石最小高度滑块键值
    public static final String GUI_SLIDER_ROCK_MIN = resolve("gui.slider.rockMin");
    // 泥土变化滑块键值
    public static final String GUI_SLIDER_DIRT_VARIANCE = resolve("gui.slider.dirtVariance");
    // 泥土最小高度滑块键值
    public static final String GUI_SLIDER_DIRT_MIN = resolve("gui.slider.dirtMin");
    // 岩石陡峭度滑块键值
    public static final String GUI_SLIDER_ROCK_STEEPNESS = resolve("gui.slider.rockSteepness");
    // 泥土陡峭度滑块键值
    public static final String GUI_SLIDER_DIRT_STEEPNESS = resolve("gui.slider.dirtSteepness");
    // 碎石陡峭度滑块键值
    public static final String GUI_SLIDER_SCREE_STEEPNESS = resolve("gui.slider.screeSteepness");
    // 雪地陡峭度滑块键值
    public static final String GUI_SLIDER_SNOW_STEEPNESS = resolve("gui.slider.snowSteepness");
    // 高度修改滑块键值
    public static final String GUI_SLIDER_HEIGHT_MODIFIER = resolve("gui.slider.heightModifier");
    // 倾斜度修改滑块键值
    public static final String GUI_SLIDER_SLOPE_MODIFIER = resolve("gui.slider.slopeModifier");
    // 表面密度阈值滑块键值
    public static final String GUI_SLIDER_SURFACE_DENSITY_THRESHOLD = resolve("gui.slider.surfaceDensityThreshold");
    // 入口洞穴概率滑块键值
    public static final String GUI_SLIDER_ENTRANCE_CAVE_CHANCE = resolve("gui.slider.entranceCaveProbability");
    // 奶酪洞穴概率滑块键值
    public static final String GUI_SLIDER_CHEESE_CAVE_CHANCE = resolve("gui.slider.cheeseCaveProbability");
    // 意大利面洞穴概率滑块键值
    public static final String GUI_SLIDER_SPAGHETTI_CAVE_CHANCE = resolve("gui.slider.spaghettiCaveProbability");
    // 面条洞穴概率滑块键值
    public static final String GUI_SLIDER_NOODLE_CAVE_CHANCE = resolve("gui.slider.noodleCaveProbability");
    // 洞穴雕刻概率滑块键值
    public static final String GUI_SLIDER_CAVE_CARVER_CHANCE = resolve("gui.slider.carverCaveProbability");
    // 深层洞穴雕刻概率滑块键值
    public static final String GUI_SLIDER_DEEP_CAVE_CARVER_CHANCE = resolve("gui.slider.deepCarverCaveProbability");
    // 沟壑雕刻概率滑块键值
    public static final String GUI_SLIDER_RAVINE_CARVER_CHANCE = resolve("gui.slider.ravineProbability");
    // 温度范围滑块键值
    public static final String GUI_SLIDER_TEMPERATURE_SCALE = resolve("gui.slider.temperatureScale");
    // 温度衰减滑块键值
    public static final String GUI_SLIDER_TEMPERATURE_FALLOFF = resolve("gui.slider.temperatureFalloff");
    // 温度最小值滑块键值
    public static final String GUI_SLIDER_TEMPERATURE_MIN = resolve("gui.slider.temperatureMin");
    // 温度最大值滑块键值
    public static final String GUI_SLIDER_TEMPERATURE_MAX = resolve("gui.slider.temperatureMax");
    // 温度偏置滑块键值
    public static final String GUI_SLIDER_TEMPERATURE_BIAS = resolve("gui.slider.temperatureBias");
    // 湿度范围滑块键值
    public static final String GUI_SLIDER_MOISTURE_SCALE = resolve("gui.slider.moistureScale");
    // 湿度衰减滑块键值
    public static final String GUI_SLIDER_MOISTURE_FALLOFF = resolve("gui.slider.moistureFalloff");
    // 湿度最小值滑块键值
    public static final String GUI_SLIDER_MOISTURE_MIN = resolve("gui.slider.moistureMin");
    // 湿度最大值滑块键值
    public static final String GUI_SLIDER_MOISTURE_MAX = resolve("gui.slider.moistureMax");
    // 湿度偏置滑块键值
    public static final String GUI_SLIDER_MOISTURE_BIAS = resolve("gui.slider.moistureBias");
    // 生态大小滑块键值
    public static final String GUI_SLIDER_BIOME_SIZE = resolve("gui.slider.biomeSize");
    // 宏观噪声大小滑块键值
    public static final String GUI_SLIDER_MACRO_NOISE_SIZE = resolve("gui.slider.macroNoiseSize");
    // 生态扭曲大小滑块键值
    public static final String GUI_SLIDER_BIOME_WARP_SCALE = resolve("gui.slider.biomeWarpScale");
    // 生态扭曲强度滑块键值
    public static final String GUI_SLIDER_BIOME_WARP_STRENGTH = resolve("gui.slider.biomeWarpStrength");
    // 生态边缘大小滑块键值
    public static final String GUI_SLIDER_BIOME_EDGE_SCALE = resolve("gui.slider.biomeEdgeScale");
    // 生态边缘八度滑块键值
    public static final String GUI_SLIDER_BIOME_EDGE_OCTAVES = resolve("gui.slider.biomeEdgeOctaves");
    // 生态边缘增益滑块键值
    public static final String GUI_SLIDER_BIOME_EDGE_GAIN = resolve("gui.slider.biomeEdgeGain");
    // 生态边缘频率滑块键值
    public static final String GUI_SLIDER_BIOME_EDGE_LACUNARITY = resolve("gui.slider.biomeEdgeLacunarity");
    // 生态边缘强度滑块键值
    public static final String GUI_SLIDER_BIOME_EDGE_STRENGTH = resolve("gui.slider.biomeEdgeStrength");
    // 地形区域大小滑块键值
    public static final String GUI_SLIDER_TERRAIN_REGION_SIZE = resolve("gui.slider.terrainRegionSize");
    // 全局垂直缩放滑块键值
    public static final String GUI_SLIDER_GLOBAL_VERTICAL_SCALE = resolve("gui.slider.globalVerticalScale");
    // 全局水平缩放滑块键值
    public static final String GUI_SLIDER_GLOBAL_HORIZONTAL_SCALE = resolve("gui.slider.globalHorizontalScale");
    // 地形权重滑块键值
    public static final String GUI_SLIDER_TERRAIN_WEIGHT = resolve("gui.slider.terrain.weight");
    // 地形基础缩放滑块键值
    public static final String GUI_SLIDER_TERRAIN_BASE_SCALE = resolve("gui.slider.terrain.baseScale");
    // 地形垂直缩放滑块键值
    public static final String GUI_SLIDER_TERRAIN_VERTICAL_SCALE = resolve("gui.slider.terrain.verticalScale");
    // 地形水平缩放滑块键值
    public static final String GUI_SLIDER_TERRAIN_HORIZONTAL_SCALE = resolve("gui.slider.terrain.horizontalScale");
    // 河流数量滑块键值
    public static final String GUI_SLIDER_RIVER_COUNT = resolve("gui.slider.riverCount");
    // 河床深度滑块键值
    public static final String GUI_SLIDER_RIVER_BED_DEPTH = resolve("gui.slider.river.bedDepth");
    // 河流最小岸高滑块键值
    public static final String GUI_SLIDER_RIVER_MIN_BANK_HEIGHT = resolve("gui.slider.river.minBankHeight");
    // 河流最大岸高滑块键值
    public static final String GUI_SLIDER_RIVER_MAX_BANK_HEIGHT = resolve("gui.slider.river.maxBankHeight");
    // 河床宽度滑块键值
    public static final String GUI_SLIDER_RIVER_BED_WIDTH = resolve("gui.slider.river.bedWidth");
    // 河岸宽度滑块键值
    public static final String GUI_SLIDER_RIVER_BANK_WIDTH = resolve("gui.slider.river.bankWidth");
    // 河流淡化滑块键值
    public static final String GUI_SLIDER_RIVER_FADE = resolve("gui.slider.river.fade");
    // 湖泊生成概率滑块键值
    public static final String GUI_SLIDER_LAKE_CHANCE = resolve("gui.slider.lake.chance");
    // 湖泊深度滑块键值
    public static final String GUI_SLIDER_LAKE_DEPTH = resolve("gui.slider.lake.depth");
    // 湖泊最小尺寸滑块键值
    public static final String GUI_SLIDER_LAKE_SIZE_MIN = resolve("gui.slider.lake.sizeMin");
    // 湖泊最大尺寸滑块键值
    public static final String GUI_SLIDER_LAKE_SIZE_MAX = resolve("gui.slider.lake.sizeMax");
    // 湖泊最小岸高滑块键值
    public static final String GUI_SLIDER_LAKE_MIN_BANK_HEIGHT = resolve("gui.slider.lake.minBankHeight");
    // 湖泊最大岸高滑块键值
    public static final String GUI_SLIDER_LAKE_MAX_BANK_HEIGHT = resolve("gui.slider.lake.maxBankHeight");
    // 湿地生成概率滑块键值
    public static final String GUI_SLIDER_WETLAND_CHANCE = resolve("gui.slider.wetlandChance");
    // 湿地最小尺寸滑块键值
    public static final String GUI_SLIDER_WETLAND_SIZE_MIN = resolve("gui.slider.wetland.sizeMin");
    // 湿地最大尺寸滑块键值
    public static final String GUI_SLIDER_WETLAND_SIZE_MAX = resolve("gui.slider.wetland.sizeMax");
    // 侵蚀滴粒每区块数滑块键值
    public static final String GUI_SLIDER_EROSION_DROPLETS_PER_CHUNK = resolve("gui.slider.erosion.dropletsPerChunk");
    // 侵蚀滴粒生命周期滑块键值
    public static final String GUI_SLIDER_EROSION_DROPLET_LIFETIME = resolve("gui.slider.erosion.dropletLifetime");
    // 侵蚀滴粒体积滑块键值
    public static final String GUI_SLIDER_EROSION_DROPLET_VOLUME = resolve("gui.slider.erosion.dropletVolume");
    // 侵蚀滴粒速度滑块键值
    public static final String GUI_SLIDER_EROSION_DROPLET_VELOCITY = resolve("gui.slider.erosion.dropletVelocity");
    // 侵蚀率滑块键值
    public static final String GUI_SLIDER_EROSION_RATE = resolve("gui.slider.erosion.rate");
    // 沉积率滑块键值
    public static final String GUI_SLIDER_DEPOSITE_RATE = resolve("gui.slider.erosion.depositeRate");
    // 平滑迭代次数滑块键值
    public static final String GUI_SLIDER_SMOOTHING_ITERATIONS = resolve("gui.slider.smoothing.iterations");
    // 平滑半径滑块键值
    public static final String GUI_SLIDER_SMOOTHING_RADIUS = resolve("gui.slider.smoothing.radius");
    // 平滑率滑块键值
    public static final String GUI_SLIDER_SMOOTHING_RATE = resolve("gui.slider.smoothing.rate");
    // 间隔滑块键值
    public static final String GUI_SLIDER_SPACING = resolve("gui.slider.spacing");
    // 分隔滑块键值
    public static final String GUI_SLIDER_SEPARATION = resolve("gui.slider.separation");
    // 地层区域大小滑块键值
    public static final String GUI_SLIDER_STRATA_REGION_SIZE = resolve("gui.slider.strataRegionSize");
    // 山地生态使用率滑块键值
    public static final String GUI_SLIDER_MOUNTAIN_BIOME_USAGE = resolve("gui.slider.mountainBiomeUsage");
    // 火山生态使用率滑块键值
    public static final String GUI_SLIDER_VOLCANO_BIOME_USAGE = resolve("gui.slider.volcanoBiomeUsage");

    // 预览区域标签键值
    public static final String GUI_LABEL_PREVIEW_AREA = resolve("gui.label.previewArea");
    // 预览地形标签键值
    public static final String GUI_LABEL_PREVIEW_TERRAIN = resolve("gui.label.previewTerrain");
    // 预览生态群系标签键值
    public static final String GUI_LABEL_PREVIEW_BIOME = resolve("gui.label.previewBiome");
    // 预览噪声值标签键值
    public static final String GUI_LABEL_PREVIEW_NOISE_VALUE = resolve("gui.label.noiseValue");
    // 大陆标签键值
    public static final String GUI_LABEL_CONTINENT = resolve("gui.label.continent");
    // 控制点标签键值
    public static final String GUI_LABEL_CONTROL_POINTS = resolve("gui.label.controlPoints");
    // 属性标签键值
    public static final String GUI_LABEL_PROPERTIES = resolve("gui.label.properties");
    // 表面侵蚀标签键值
    public static final String GUI_LABEL_SURFACE_EROSION = resolve("gui.label.surfaceErosion");
    // 噪声洞穴标签键值
    public static final String GUI_LABEL_NOISE_CAVES = resolve("gui.label.noiseCaves");
    // 雕刻器标签键值
    public static final String GUI_LABEL_CARVERS = resolve("gui.label.carvers");
    // 温度标签键值
    public static final String GUI_LABEL_TEMPERATURE = resolve("gui.label.temperature");
    // 湿度标签键值
    public static final String GUI_LABEL_MOISTURE = resolve("gui.label.moisture");
    // 生态群系形状标签键值
    public static final String GUI_LABEL_BIOME_SHAPE = resolve("gui.label.biomeShape");
    // 生态群系边缘形状标签键值
    public static final String GUI_LABEL_BIOME_EDGE_SHAPE = resolve("gui.label.biomeEdgeShape");
    // 常规标签键值
    public static final String GUI_LABEL_GENERAL = resolve("gui.label.general");
    // 大草原标签键值
    public static final String GUI_LABEL_STEPPE = resolve("gui.label.steppe");
    // 平原标签键值
    public static final String GUI_LABEL_PLAINS = resolve("gui.label.plains");
    // 丘陵标签键值
    public static final String GUI_LABEL_HILLS = resolve("gui.label.hills");
    // 谷地标签键值
    public static final String GUI_LABEL_DALES = resolve("gui.label.dales");
    // 高原标签键值
    public static final String GUI_LABEL_PLATEAU = resolve("gui.label.plateau");
    // 荒地标签键值
    public static final String GUI_LABEL_BADLANDS = resolve("gui.label.badlands");
    // 古老红砂岩标签键值
    public static final String GUI_LABEL_TORRIDONIAN = resolve("gui.label.torridonian");
    // 山脉标签键值
    public static final String GUI_LABEL_MOUNTAINS = resolve("gui.label.mountains");
    // 火山标签键值
    public static final String GUI_LABEL_VOLCANO = resolve("gui.label.volcano");
    // 主流标签键值
    public static final String GUI_LABEL_MAIN_RIVERS = resolve("gui.label.mainRivers");
    // 支流标签键值
    public static final String GUI_LABEL_BRANCH_RIVERS = resolve("gui.label.branchRivers");
    // 湖泊标签键值
    public static final String GUI_LABEL_LAKES = resolve("gui.label.lakes");
    // 湿地标签键值
    public static final String GUI_LABEL_WETLANDS = resolve("gui.label.wetlands");
    // 侵蚀标签键值
    public static final String GUI_LABEL_EROSION = resolve("gui.label.erosion");
    // 平滑处理标签键值
    public static final String GUI_LABEL_SMOOTHING = resolve("gui.label.smoothing");

    // 定位命令找到地形的提示键值
    public static final String TERRAIN_FOUND = resolve("commands.locate.terrain.found");
    // 定位命令未找到地形的提示键值
    public static final String TERRAIN_NOT_FOUND = resolve("commands.locate.terrain.not_found");
    // 定位命令地形参数无效的提示键值
    public static final String TERRAIN_ARGUMENT_INVALID = resolve("argument.terrain.invalid");

    /**
     * @brief 生成完全限定的键名。
     * 将模组的ID与提供的键名相结合，生成一个完全限定的键名。
     * @param key 要生成完全限定键的键名。
     * @return 返回完全限定的键名字符串。 
    */
    private static String resolve(String key) {
        return RTFCommon.MOD_ID + "." + key;
    }
}