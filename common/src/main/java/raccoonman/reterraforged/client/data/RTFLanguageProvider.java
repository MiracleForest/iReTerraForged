package raccoonman.reterraforged.client.data;

import net.minecraft.data.PackOutput;
import raccoonman.reterraforged.RTFCommon;
import raccoonman.reterraforged.client.gui.Tooltips;

// TODO add some more languages
/**
 * RTFLanguageProvider类用于为ReTerraForged Minecraft模组提供语言资源。
 * 此类目前包含一个用于英语（美国）翻译的静态内部类，未来可以扩展以支持更多语言。
 * 这个类是客户端数据操作的一部分，用于将模组的用户界面国际化。
 */
public class RTFLanguageProvider {

    /**
     * 静态内部类，用于提供ReTerraForged模组的英语（美国）翻译。
     */
    public static class EnglishUS extends LanguageProvider {

        /**
         * 构造一个新的EnglishUS翻译提供者。
         * 
         * @param output 翻译文件将写入的PackOutput。
         */
        public EnglishUS(PackOutput output) {
            super(output, RTFCommon.MOD_ID, "en_us");
        }

        /**
         * 为英语（美国）语言添加所有的翻译。
         */
        @Override
        protected void addTranslations() {
            // 添加ReTerraForged模组资源的元数据描述翻译。
            this.add(RTFTranslationKeys.METADATA_DESCRIPTION, "ReTerraForged resources");
            // 为ReTerraForged预设的元数据描述添加翻译。
            this.add(RTFTranslationKeys.PRESET_METADATA_DESCRIPTION, "ReTerraForged preset");
            // 将沼泽地材质更改为泥的元数据描述翻译。
            this.add(RTFTranslationKeys.MUD_SWAMPS_METADATA_DESCRIPTION, "Changes the swamp material to mud");
            // 定义无错误信息时的占位翻译。
            this.add(RTFTranslationKeys.NO_ERROR_MESSAGE, "{No error message}");

            // 设置GUI输入提示，提示用户输入预设名称。
            this.add(RTFTranslationKeys.GUI_INPUT_PROMPT, "Type preset name");

            // 添加提示信息，说明找不到任何旧版预设。
            this.add(RTFTranslationKeys.GUI_SELECT_PRESET_MISSING_LEGACY_PRESETS, "Couldn't find any legacy presets");
            // 添加预设选择界面的标题。
            this.add(RTFTranslationKeys.GUI_SELECT_PRESET_TITLE, "Presets & Defaults");
            // 添加ReTerraForged默认预设的名称。
            this.add(RTFTranslationKeys.GUI_DEFAULT_PRESET_NAME, "ReTerraForged - Default");
            // 添加TerraForged默认旧版预设的名称。
            this.add(RTFTranslationKeys.GUI_DEFAULT_LEGACY_PRESET_NAME, "TerraForged - Default");
            // 添加TerraForged美丽预设的名称。
            this.add(RTFTranslationKeys.GUI_BEAUTIFUL_PRESET_NAME, "TerraForged - Beautiful");
            // 添加TerraForged巨大生态预设的名称。
            this.add(RTFTranslationKeys.GUI_HUGE_BIOMES_PRESET_NAME, "TerraForged - Huge Biomes");
            // 添加TerraForged精简预设的名称。
            this.add(RTFTranslationKeys.GUI_LITE_PRESET_NAME, "TerraForged - Lite");
            // 添加TerraForged接近原版风格的预设名称。
            this.add(RTFTranslationKeys.GUI_VANILLAISH_PRESET_NAME, "TerraForged - Vanilla-ish");
            // 添加世界设置界面的标题。
            this.add(RTFTranslationKeys.GUI_WORLD_SETTINGS_TITLE, "World Settings");
            // 添加实验性表面设置界面的标题。
            this.add(RTFTranslationKeys.GUI_SURFACE_SETTINGS_TITLE, "Surface Settings (Experimental)");
            // 添加实验性洞穴设置界面的标题。
            this.add(RTFTranslationKeys.GUI_CAVE_SETTINGS_TITLE, "Cave Settings (Experimental)");
            // 添加气候设置界面的标题。
            this.add(RTFTranslationKeys.GUI_CLIMATE_SETTINGS_TITLE, "Climate Settings");
            // 添加地形设置界面的标题。
            this.add(RTFTranslationKeys.GUI_TERRAIN_SETTINGS_TITLE, "Terrain Settings");
            // 添加河流设置界面的标题。
            this.add(RTFTranslationKeys.GUI_RIVER_SETTINGS_TITLE, "River Settings");
            // 添加筛选设置界面的标题。
            this.add(RTFTranslationKeys.GUI_FILTER_SETTINGS_TITLE, "Filter Settings");
            // 添加结构设置界面的标题。
            this.add(RTFTranslationKeys.GUI_STRUCTURE_SETTINGS_TITLE, "Structure Settings");
            // 添加杂项设置界面的标题。
            this.add(RTFTranslationKeys.GUI_MISCELLANEOUS_SETTINGS_TITLE, "Miscellaneous Settings");

            // 翻译“真”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_TRUE, "true");
            // 翻译“假”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_FALSE, "false");
            // 翻译“创建”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_CREATE, "Create");
            // 翻译“复制”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_COPY, "Copy");
            // 翻译“删除”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_DELETE, "Delete");
            // 翻译“打开预设文件夹”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_OPEN_PRESET_FOLDER, "Open Preset Folder");
            // 翻译“打开导出文件夹”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_OPEN_EXPORT_FOLDER, "Open Export Folder");
            // 翻译“导出为数据包”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_EXPORT_AS_DATAPACK, "Export As Datapack");
            // 翻译“导出预设”成功提示
            this.add(RTFTranslationKeys.GUI_BUTTON_EXPORT_SUCCESS, "Exported Preset");
            // 翻译“种子”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_SEED, "Seed");
            // 翻译“大陆类型”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_CONTINENT_TYPE, "Continent Type");
            // 翻译“大陆形状”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_CONTINENT_SHAPE, "Continent Shape");
            // 翻译“生成类型”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_SPAWN_TYPE, "Spawn Type");
            // 翻译“大型矿脉”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_LARGE_ORE_VEINS, "Large Ore Veins");
            // 翻译“旧版雕刻器分布”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_LEGACY_CARVER_DISTRIBUTION, "Legacy Carver Distribution");
            // 翻译“气候种子偏移”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_CLIMATE_SEED_OFFSET, "Seed Offset");
            // 翻译“生态边缘类型”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_BIOME_EDGE_TYPE, "Type");
            // 翻译“地形种子偏移”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_TERRAIN_SEED_OFFSET, "Terrain Seed Offset");
            // 翻译“华丽山脉”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_FANCY_MOUNTAINS, "Fancy Mountains");
            // 翻译“河流种子偏移”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_RIVER_SEED_OFFSET, "Seed Offset");
            // 翻译“盐”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_SALT, "Salt");
            // 翻译“禁用”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_DISABLED, "Disabled");
            // 翻译“平滑层装饰”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_SMOOTH_LAYER_DECORATOR, "Smooth Layer Decorator");
            // 翻译“地层装饰”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_STRATA_DECORATOR, "Strata Decorator");
            // 翻译“仅矿石兼容石材”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_ORE_COMPATIBLE_STONE_ONLY, "Ore Compatible Stone Only");
            // 翻译“侵蚀装饰”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_EROSION_DECORATOR, "Erosion Decorator");
            // 翻译“普通石材侵蚀”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_PLAIN_STONE_EROSION, "Plain Stone Erosion");
            // 翻译“自然降雪装饰”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_NATURAL_SNOW_DECORATOR, "Natural Snow Decorator");
            // 翻译“自定义生态特征”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_CUSTOM_BIOME_FEATURES, "Custom Biome Features");
            // 翻译“原版泉水”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_VANILLA_SPRINGS, "Vanilla Springs");
            // 翻译“原版熔岩湖”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_VANILLA_LAVA_LAKES, "Vanilla Lava Lakes");
            // 翻译“原版熔岩泉”按钮
            this.add(RTFTranslationKeys.GUI_BUTTON_VANILLA_LAVA_SPRINGS, "Vanilla Lava Springs");

            // 翻译“缩放”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_ZOOM, "Zoom");
            // 翻译“大陆规模”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_CONTINENT_SCALE, "Continent Scale");
            // 翻译“大陆抖动”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_CONTINENT_JITTER, "Continent Jitter");
            // 翻译“大陆跳过”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_CONTINENT_SKIPPING, "Continent Skipping");
            // 翻译“大陆大小变化”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_CONTINENT_SIZE_VARIANCE, "Continent Size Variance");
            // 翻译“大陆噪声八度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_CONTINENT_NOISE_OCTAVES, "Continent Noise Octaves");
            // 翻译“大陆噪声增益”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_CONTINENT_NOISE_GAIN, "Continent Noise Gain");
            // 翻译“大陆噪声频率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_CONTINENT_NOISE_LACUNARITY, "Continent Noise Lacunarity");
            // 翻译“岛屿内陆”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_ISLAND_INLAND, "Island Inland");
            // 翻译“岛屿海岸”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_ISLAND_COAST, "Island Coast");
            // 翻译“深海”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_DEEP_OCEAN, "Deep Ocean");
            // 翻译“浅海”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_SHALLOW_OCEAN, "Shallow Ocean");
            // 翻译“海滩”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_BEACH, "Beach");
            // 翻译“海岸”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_COAST, "Coast");
            // 翻译“近内陆”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_NEAR_INLAND, "Near Inland");
            // 翻译“中内陆”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_MID_INLAND, "Mid Inland");
            // 翻译“远内陆”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_FAR_INLAND, "Far Inland");
            // 翻译“世界高度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_WORLD_HEIGHT, "World Height");
            // 翻译“世界深度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_WORLD_DEPTH, "World Depth");
            // 翻译“海平面”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_SEA_LEVEL, "Sea Level");
            // 翻译“熔岩层”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_LAVA_LEVEL, "Lava Level");
            // 翻译“岩石变化”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_ROCK_VARIANCE, "Rock Variance");
            // 翻译“岩石最小高度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_ROCK_MIN, "Rock Min");
            // 翻译“泥土变化”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_DIRT_VARIANCE, "Dirt Variance");
            // 翻译“泥土最小高度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_DIRT_MIN, "Dirt Min");
            // 翻译“岩石陡峭度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_ROCK_STEEPNESS, "Rock Steepness");
            // 翻译“泥土陡峭度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_DIRT_STEEPNESS, "Dirt Steepness");
            // 翻译“碎石陡峭度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_SCREE_STEEPNESS, "Scree Steepness");
            // 翻译“雪地陡峭度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_SNOW_STEEPNESS, "Snow Steepness");
            // 翻译“高度修改”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_HEIGHT_MODIFIER, "Height Modifier");
            // 翻译“倾斜度修改”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_SLOPE_MODIFIER, "Slope Modifier");
            // 翻译“表面密度阈值”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_SURFACE_DENSITY_THRESHOLD, "Surface Density Threshold");
            // 翻译“入口洞穴概率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_ENTRANCE_CAVE_CHANCE, "Entrance Cave Chance");
            // 翻译“奶酪洞穴概率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_CHEESE_CAVE_CHANCE, "Cheese Cave Chance");
            // 翻译“意大利面洞穴概率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_SPAGHETTI_CAVE_CHANCE, "Spaghetti Cave Chance");
            // 翻译“面条洞穴概率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_NOODLE_CAVE_CHANCE, "Noodle Cave Chance");
            // 翻译“洞穴雕刻概率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_CAVE_CARVER_CHANCE, "Cave Carver Chance");
            // 翻译“深层洞穴雕刻概率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_DEEP_CAVE_CARVER_CHANCE, "Deep Cave Carver Chance");
            // 翻译“沟壑雕刻概率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_RAVINE_CARVER_CHANCE, "Ravine Carver Chance");
            // 翻译“温度范围”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_TEMPERATURE_SCALE, "Scale");
            // 翻译“温度衰减”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_TEMPERATURE_FALLOFF, "Falloff");
            // 翻译“温度最小值”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_TEMPERATURE_MIN, "Min");
            // 翻译“温度最大值”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_TEMPERATURE_MAX, "Max");
            // 翻译“温度偏置”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_TEMPERATURE_BIAS, "Bias");
            // 翻译“湿度范围”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_MOISTURE_SCALE, "Scale");
            // 翻译“湿度衰减”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_MOISTURE_FALLOFF, "Falloff");
            // 翻译“湿度最小值”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_MOISTURE_MIN, "Min");
            // 翻译“湿度最大值”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_MOISTURE_MAX, "Max");
            // 翻译“湿度偏置”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_MOISTURE_BIAS, "Bias");
            // 翻译“生态大小”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_BIOME_SIZE, "Biome Size");
            // 翻译“宏观噪声大小”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_MACRO_NOISE_SIZE, "Macro Noise Size");
            // 翻译“生态扭曲大小”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_BIOME_WARP_SCALE, "Biome Warp Size");
            // 翻译“生态扭曲强度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_BIOME_WARP_STRENGTH, "Biome Warp Strength");
            // 翻译“生态边缘大小”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_BIOME_EDGE_SCALE, "Scale");
            // 翻译“生态边缘八度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_BIOME_EDGE_OCTAVES, "Octaves");
            // 翻译“生态边缘增益”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_BIOME_EDGE_GAIN, "Gain");
            // 翻译“生态边缘频率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_BIOME_EDGE_LACUNARITY, "Lacunarity");
            // 翻译“生态边缘强度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_BIOME_EDGE_STRENGTH, "Strength");
            // 翻译“地形区域大小”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_TERRAIN_REGION_SIZE, "Terrain Region Size");
            // 翻译“全局垂直缩放”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_GLOBAL_VERTICAL_SCALE, "Global Vertical Scale");
            // 翻译“全局水平缩放”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_GLOBAL_HORIZONTAL_SCALE, "Global Horizontal Scale");
            // 翻译“地形权重”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_TERRAIN_WEIGHT, "Weight");
            // 翻译“地形基础缩放”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_TERRAIN_BASE_SCALE, "Base Scale");
            // 翻译“地形垂直缩放”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_TERRAIN_VERTICAL_SCALE, "Vertical Scale");
            // 翻译“地形水平缩放”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_TERRAIN_HORIZONTAL_SCALE, "Horizontal Scale");
            // 翻译“河流数量”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_RIVER_COUNT, "River Count");
            // 翻译“河床深度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_RIVER_BED_DEPTH, "Bed Depth");
            // 翻译“河流最小岸高”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_RIVER_MIN_BANK_HEIGHT, "Min Bank Height");
            // 翻译“河流最大岸高”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_RIVER_MAX_BANK_HEIGHT, "Max Bank Height");
            // 翻译“河床宽度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_RIVER_BED_WIDTH, "Bed width");
            // 翻译“河岸宽度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_RIVER_BANK_WIDTH, "Bank width");
            // 翻译“河流淡化”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_RIVER_FADE, "Fade");
            // 翻译“湖泊生成概率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_LAKE_CHANCE, "Chance");
            // 翻译“湖泊深度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_LAKE_DEPTH, "Depth");
            // 翻译“湖泊最小尺寸”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_LAKE_SIZE_MIN, "Size Min");
            // 翻译“湖泊最大尺寸”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_LAKE_SIZE_MAX, "Size Max");
            // 翻译“湖泊最小岸高”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_LAKE_MIN_BANK_HEIGHT, "Min Bank Height");
            // 翻译“湖泊最大岸高”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_LAKE_MAX_BANK_HEIGHT, "Max Bank Height");
            // 翻译“湿地生成概率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_WETLAND_CHANCE, "Chance");
            // 翻译“湿地最小尺寸”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_WETLAND_SIZE_MIN, "Size Min");
            // 翻译“湿地最大尺寸”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_WETLAND_SIZE_MAX, "Size Max");
            // 翻译“侵蚀滴粒每区块数”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_EROSION_DROPLETS_PER_CHUNK, "Droplets Per Chunk");
            // 翻译“侵蚀滴粒生命周期”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_EROSION_DROPLET_LIFETIME, "Droplet Lifetime");
            // 翻译“侵蚀滴粒体积”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_EROSION_DROPLET_VOLUME, "Droplet Volume");
            // 翻译“侵蚀滴粒速度”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_EROSION_DROPLET_VELOCITY, "Droplet Velocity");
            // 翻译“侵蚀率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_EROSION_RATE, "Erosion Rate");
            // 翻译“沉积率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_DEPOSITE_RATE, "Deposite Rate");
            // 翻译“平滑迭代次数”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_SMOOTHING_ITERATIONS, "Smoothing Iterations");
            // 翻译“平滑半径”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_SMOOTHING_RADIUS, "Smoothing Radius");
            // 翻译“平滑率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_SMOOTHING_RATE, "Smoothing Rate");
            // 翻译“间隔”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_SPACING, "Spacing");
            // 翻译“分隔”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_SEPARATION, "Separation");
            // 翻译“地层区域大小”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_STRATA_REGION_SIZE, "Strata Region Size");
            // 翻译“山地生态使用率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_MOUNTAIN_BIOME_USAGE, "Mountain Biome Usage");
            // 翻译“火山生态使用率”滑块
            this.add(RTFTranslationKeys.GUI_SLIDER_VOLCANO_BIOME_USAGE, "Volcano Biome Usage");

            //TODO move the trailing colon and space to PresetEditorPage
            // 添加预览区域标签
            this.add(RTFTranslationKeys.GUI_LABEL_PREVIEW_AREA, "Area: ");
            // 添加地形预览标签
            this.add(RTFTranslationKeys.GUI_LABEL_PREVIEW_TERRAIN, "Terrain: ");
            // 添加生态群系预览标签
            this.add(RTFTranslationKeys.GUI_LABEL_PREVIEW_BIOME, "Biome: ");
            // 添加噪声值预览标签
            this.add(RTFTranslationKeys.GUI_LABEL_PREVIEW_NOISE_VALUE, "Noise Value: ");
            // 添加大陆标签
            this.add(RTFTranslationKeys.GUI_LABEL_CONTINENT, "Continent");
            // 添加控制点标签
            this.add(RTFTranslationKeys.GUI_LABEL_CONTROL_POINTS, "Control Points");
            // 添加属性标签
            this.add(RTFTranslationKeys.GUI_LABEL_PROPERTIES, "Properties");
            // 添加表面侵蚀标签
            this.add(RTFTranslationKeys.GUI_LABEL_SURFACE_EROSION, "Erosion");
            // 添加噪声洞穴标签
            this.add(RTFTranslationKeys.GUI_LABEL_NOISE_CAVES, "Noise Caves");
            // 添加雕刻器标签
            this.add(RTFTranslationKeys.GUI_LABEL_CARVERS, "Carvers");
            // 添加温度标签
            this.add(RTFTranslationKeys.GUI_LABEL_TEMPERATURE, "Temperature");
            // 添加湿度标签
            this.add(RTFTranslationKeys.GUI_LABEL_MOISTURE, "Moisture");
            // 添加生态群系形状标签
            this.add(RTFTranslationKeys.GUI_LABEL_BIOME_SHAPE, "Biome Shape");
            // 添加生态群系边缘形状标签
            this.add(RTFTranslationKeys.GUI_LABEL_BIOME_EDGE_SHAPE, "Biome Edge Shape");
            // 添加常规标签
            this.add(RTFTranslationKeys.GUI_LABEL_GENERAL, "General");
            // 添加大草原标签
            this.add(RTFTranslationKeys.GUI_LABEL_STEPPE, "Steppe");
            // 添加平原标签
            this.add(RTFTranslationKeys.GUI_LABEL_PLAINS, "Plains");
            // 添加丘陵标签
            this.add(RTFTranslationKeys.GUI_LABEL_HILLS, "Hills");
            // 添加谷地标签
            this.add(RTFTranslationKeys.GUI_LABEL_DALES, "Dales");
            // 添加高原标签
            this.add(RTFTranslationKeys.GUI_LABEL_PLATEAU, "Plateau");
            // 添加荒地标签
            this.add(RTFTranslationKeys.GUI_LABEL_BADLANDS, "Badlands");
            // 添加古老红砂岩标签
            this.add(RTFTranslationKeys.GUI_LABEL_TORRIDONIAN, "Torridonian");
            // 添加山脉标签
            this.add(RTFTranslationKeys.GUI_LABEL_MOUNTAINS, "Mountains");
            // 添加火山标签
            this.add(RTFTranslationKeys.GUI_LABEL_VOLCANO, "Volcano");
            // 添加主流标签
            this.add(RTFTranslationKeys.GUI_LABEL_MAIN_RIVERS, "Main Rivers");
            // 添加支流标签
            this.add(RTFTranslationKeys.GUI_LABEL_BRANCH_RIVERS, "Branch Rivers");
            // 添加湖泊标签
            this.add(RTFTranslationKeys.GUI_LABEL_LAKES, "Lakes");
            // 添加湿地标签
            this.add(RTFTranslationKeys.GUI_LABEL_WETLANDS, "Wetlands");
            // 添加侵蚀标签
            this.add(RTFTranslationKeys.GUI_LABEL_EROSION, "Erosion");
            // 添加平滑处理标签
            this.add(RTFTranslationKeys.GUI_LABEL_SMOOTHING, "Smoothing");

            // 定位最近的地形类型
            this.add(RTFTranslationKeys.TERRAIN_FOUND, "The nearest %s is at %s (%s blocks away)");
            // 未在合理距离内找到地形
            this.add(RTFTranslationKeys.TERRAIN_NOT_FOUND, "Could not find a \"%s\" within reasonable distance");
            // 地形类型名称无效
            this.add(RTFTranslationKeys.TERRAIN_ARGUMENT_INVALID, "Could not find a terrain type with the name \"%s\"");

            // 添加创建预设失败的提示
            this.add(Tooltips.failTranslationKey(RTFTranslationKeys.GUI_BUTTON_CREATE), "Failed to create preset");
            // 添加复制预设失败的提示
            this.add(Tooltips.failTranslationKey(RTFTranslationKeys.GUI_BUTTON_COPY), "Failed to copy preset");
            // 添加删除预设失败的提示
            this.add(Tooltips.failTranslationKey(RTFTranslationKeys.GUI_BUTTON_DELETE), "Failed to delete preset");
            // 添加导出预设失败的提示
            this.add(Tooltips.failTranslationKey(RTFTranslationKeys.GUI_BUTTON_EXPORT_AS_DATAPACK), "Failed to export preset");
            // 控制世界生成种子
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_SEED), "Controls the world seed");
            // 控制大陆生成器类型
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_CONTINENT_TYPE), "Controls the continent generator type");
            // 控制大陆形状的计算方式
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_CONTINENT_SHAPE), "Controls how continent shapes are calculated. You may also need to adjust the transition points to ensure beaches etc still form.");
            // 设置出生点位置
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_SPAWN_TYPE), "Set whether spawn should be close to x=0,z=0 or the centre of the nearest continent");
            // 控制大型矿脉的生成
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_LARGE_ORE_VEINS), "Set whether large ore veins spawn");
            // 控制雕刻器是否使用1.16版本的分布
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_LEGACY_CARVER_DISTRIBUTION), "Set whether carvers use 1.16 distribution");
            // 控制气候分布的随机种子偏移
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_CLIMATE_SEED_OFFSET), "A seed offset used to randomise climate distribution");
            // 控制噪声类型
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_BIOME_EDGE_TYPE), "The noise type");
            // 控制地形分布的随机种子偏移
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_TERRAIN_SEED_OFFSET), "A seed offset used to randomise terrain distribution");
            // 对山脉进行额外处理以改善外观
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_FANCY_MOUNTAINS), "Carries out extra processing on mountains to make them look even nicer. Can be disabled to improve performance slightly.");
            // 控制河流分布的随机种子偏移
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_RIVER_SEED_OFFSET), "A seed offset used to randomise river distribution");
            // 为结构设置随机种子值
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_SALT), "A random seed value for the structure.");
            // 阻止结构生成
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_DISABLED), "Prevent this structure from generating.");
            // 修改层级方块以适应地形
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_SMOOTH_LAYER_DECORATOR), "Modifies layer block levels (ie snow) to fit the terrain");
            // 生成岩层而非仅石头
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_STRATA_DECORATOR), "Generates strata (rock layers) instead of just stone");
            // 仅使用矿石可以生成的石头类型
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_ORE_COMPATIBLE_STONE_ONLY), "Only use stone types that ores can generate in");
            // 在侵蚀发生的地方替换表面材料
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_EROSION_DECORATOR), "Replace surface materials where erosion has occurred");
            // 将大多数暴露的岩石表面更改为普通石头
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_PLAIN_STONE_EROSION), "Changes most exposed rock surfaces to plain stone");
            // 在不应该自然积雪的地方移除积雪
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_NATURAL_SNOW_DECORATOR), "Removes snow from the terrain where it shouldn't naturally settle");
            // 使用自定义生态群系特征代替原版特征
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_CUSTOM_BIOME_FEATURES), "Use custom biome features in place of vanilla ones (such as trees)");
            // 允许生成原版泉水
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_VANILLA_SPRINGS), "Allow vanilla springs (water source blocks) to generate");
            // 允许生成原版熔岩湖
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_VANILLA_LAVA_LAKES), "Allow vanilla lava-lakes to generate");
            // 允许生成原版熔岩泉
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_BUTTON_VANILLA_LAVA_SPRINGS), "Allow vanilla springs (lava source blocks) to generate");
            // 控制预览地图的缩放级别
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_ZOOM), "Controls the zoom level of the preview map");
            // 控制大陆大小
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_CONTINENT_SCALE), "Controls the size of continents. You may also need to adjust the transition points to ensure beaches etc still form.");
            // 控制大陆中心的偏移量
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_CONTINENT_JITTER), "Controls how much continent centers are offset from the underlying noise grid.");
            // 减少大陆数量以创造更广阔的海洋
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_CONTINENT_SKIPPING), "Reduces the number of continents to create more vast oceans.");
            // 增加大陆大小的变化
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_CONTINENT_SIZE_VARIANCE), "Increases the variance of continent sizes.");
            // 控制用于扭曲大陆的噪声的八度数量
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_CONTINENT_NOISE_OCTAVES), "The number of octaves of noise used to distort the continent.");
            // 控制每个噪声八度的贡献强度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_CONTINENT_NOISE_GAIN), "The contribution strength of each noise octave.");
            // 控制每个噪声八度的频率乘数
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_CONTINENT_NOISE_LACUNARITY), "The frequency multiplier for each noise octave.");
            // 控制岛屿海岸过渡到岛屿的阈值
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_ISLAND_INLAND), "Controls the point below which island coasts transition into island. The greater the gap to the island coasts slider, the more gradual the transition.");
            // 控制深海过渡到岛屿海岸的阈值
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_ISLAND_COAST), "Controls the point below which deep oceans transition into island coasts. The greater the gap to the deep ocean slider, the more gradual the transition.");
            // 控制深海过渡到浅海的阈值
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_DEEP_OCEAN), "Controls the point above which deep oceans transition into shallow oceans. The greater the gap to the shallow ocean slider, the more gradual the transition.");
            // 控制浅海过渡到沿海地形的阈值
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_SHALLOW_OCEAN), "Controls the point above which shallow oceans transition into coastal terrain. The greater the gap to the coast slider, the more gradual the transition.");
            // 控制沿海地形中分配给海滩生态群系的部分
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_BEACH), "Controls how much of the coastal terrain is assigned to beach biomes.");
            // 控制沿海区域的大小
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_COAST), "Controls the size of coastal regions and is also the point below which inland terrain transitions into oceans.");
            // 控制生态群系过渡到近内陆生态群系的点
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_NEAR_INLAND), "Controls the point at which biomes transition into near inland biomes.");
            // 控制生态群系过渡到中内陆生态群系的点
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_MID_INLAND), "Controls the point at which biomes transition into mid inland biomes.");
            // 控制生态群系过渡到远内陆生态群系的点
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_FAR_INLAND), "Controls the point at which biomes transition into far inland biomes.");
            // 控制世界高度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_WORLD_HEIGHT), "Controls the world height");
            // 控制世界最低Y级
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_WORLD_DEPTH), "Controls the minimum y level");
            // 控制海平面高度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_SEA_LEVEL), "Controls the sea level");
            // 控制岩浆层高度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_LAVA_LEVEL), "Controls the lava level.");
            // 控制岩石梯度的密度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_ROCK_VARIANCE), "Controls the density of the rock gradient");
            // 控制表面可以过渡到岩石的Y级
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_ROCK_MIN), "Controls the y level at which the surface can transition into rock");
            // 控制泥土梯度的密度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_DIRT_VARIANCE), "Controls the density of the dirt gradient");
            // 控制表面可以过渡到泥土的Y级
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_DIRT_MIN), "Controls the y level at which the surface can transition into dirt");
            // 控制表面转换为岩石的陡峭程度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_ROCK_STEEPNESS), "The steepness at which the surface can transition into rock");
            // 控制表面转换为泥土的陡峭程度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_DIRT_STEEPNESS), "The steepness at which the surface can transition into dirt");
            // 控制表面转换为砾石的陡峭程度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_SCREE_STEEPNESS), "The steepness at which the surface can transition into gravel");
            // 控制表面转换为雪的陡峭程度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_SNOW_STEEPNESS), "The steepness at which the surface can transition into snow");
            // 控制高度调整
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_HEIGHT_MODIFIER), "Controls the height modifier");
            // 控制斜率调整
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_SLOPE_MODIFIER), "Controls the slope modifier");
            // 控制生成奶酪洞穴的表面深度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_SURFACE_DENSITY_THRESHOLD), "Controls the surface depth at which cheese caves start to generate");
            // 控制生成入口洞穴的概率
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_ENTRANCE_CAVE_CHANCE), "Controls the probability that an entrance cave will generate");
            // 控制生成奶酪洞穴的概率
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_CHEESE_CAVE_CHANCE), "Controls probability that a cheese cave will generate");
            // 控制生成意大利面洞穴的概率
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_SPAGHETTI_CAVE_CHANCE), "Controls the probability that a spaghetti cave will generate");
            // 控制生成面条洞穴的概率
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_NOODLE_CAVE_CHANCE), "Controls probability that a noodle cave will generate");
            // 控制洞穴雕刻发生的概率
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_CAVE_CARVER_CHANCE), "Controls the probability that a cave carver will generate");
            // 控制深层洞穴雕刻发生的概率
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_DEEP_CAVE_CARVER_CHANCE), "Controls the probability that a deep cave carver will generate");
            // 控制沟壑雕刻发生的概率
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_RAVINE_CARVER_CHANCE), "Controls the probability that a ravine carver will generate");
            // 控制温度的水平尺度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_TEMPERATURE_SCALE), "The horizontal scale");
            // 控制值从极端值过渡的速度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_TEMPERATURE_FALLOFF), "How quickly values transition from an extremity");
            // 控制温度范围的下限
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_TEMPERATURE_MIN), "The lower limit of the range");
            // 控制温度范围的上限
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_TEMPERATURE_MAX), "The upper limit of the range");
            // 控制温度范围的偏置
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_TEMPERATURE_BIAS), "The bias towards either end of the range");
            // 控制湿度的水平尺度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_MOISTURE_SCALE), "The horizontal scale");
            // 控制湿度从极端值过渡的速度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_MOISTURE_FALLOFF), "How quickly values transition from an extremity");
            // 控制湿度范围的下限
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_MOISTURE_MIN), "The lower limit of the range");
            // 控制湿度范围的上限
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_MOISTURE_MAX), "The upper limit of the range");
            // 控制湿度范围的偏置
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_MOISTURE_BIAS), "The bias towards either end of the range");
            // 控制个别生态群系的大小
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_BIOME_SIZE), "Controls the size of individual biomes");
            // 使用宏观噪声将大片生态群系区域归类为单一类型
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_MACRO_NOISE_SIZE), "Macro noise is used to group large areas of biomes into a single type (such as deserts)");
            // 控制生态群系形状扭曲的尺度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_BIOME_WARP_SCALE), "Controls the scale of shape distortion for biomes");
            // 控制生态群系形状扭曲的强度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_BIOME_WARP_STRENGTH), "Controls the strength of shape distortion for biomes");
            // 控制噪声的尺度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_BIOME_EDGE_SCALE), "Controls the scale of the noise");
            // 控制噪声的八度数量
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_BIOME_EDGE_OCTAVES), "Controls the number of noise octaves");
            // 控制后续噪声八度的增益
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_BIOME_EDGE_GAIN), "Controls the gain subsequent noise octaves");
            // 控制后续噪声八度的频率乘数
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_BIOME_EDGE_LACUNARITY), "Controls the lacunarity of subsequent noise octaves");
            // 控制噪声的强度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_BIOME_EDGE_STRENGTH), "Controls the strength of the noise");
            // 控制地形区域的大小
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_TERRAIN_REGION_SIZE), "Controls the size of terrain regions");
            // 全局控制地形的垂直缩放
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_GLOBAL_VERTICAL_SCALE), "Globally controls the vertical scaling of terrain");
            // 全局控制地形的水平缩放
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_GLOBAL_HORIZONTAL_SCALE), "Globally controls the horizontal scaling of terrain");
            // 控制这种地形类型的常见程度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_TERRAIN_WEIGHT), "Controls how common this terrain type is");
            // 控制这种地形的基础高度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_TERRAIN_BASE_SCALE), "Controls the base height of this terrain");
            // 垂直拉伸或压缩地形
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_TERRAIN_VERTICAL_SCALE), "Stretches or compresses the terrain vertically");
            // 水平拉伸或压缩地形
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_TERRAIN_HORIZONTAL_SCALE), "Stretches or compresses the terrain horizontally");
            // 控制每个大陆的主河流数量
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_RIVER_COUNT), "Controls the number of main rivers per continent.");
            // 控制河流的深度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_RIVER_BED_DEPTH), "Controls the depth of the river");
            // 控制河岸的最小高度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_RIVER_MIN_BANK_HEIGHT), "Controls the height of river banks");
            // 控制河岸的最大高度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_RIVER_MAX_BANK_HEIGHT), "Controls the height of river banks");
            // 控制河床的宽度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_RIVER_BED_WIDTH), "Controls the river-bed width");
            // 控制河岸的宽度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_RIVER_BANK_WIDTH), "Controls the river-banks width");
            // 控制河流的渐变程度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_RIVER_FADE), "Controls how much rivers taper");
            // 控制湖泊生成的概率
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_LAKE_CHANCE), "Controls the chance of a lake spawning");
            // 控制湖泊的最大深度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_LAKE_DEPTH), "The max depth of the lake");
            // 控制湖泊的最小尺寸
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_LAKE_SIZE_MIN), "The minimum size of the lake");
            // 控制湖泊的最大尺寸
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_LAKE_SIZE_MAX), "The maximum size of the lake");
            // 控制湖泊的最小河岸高度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_LAKE_MIN_BANK_HEIGHT), "The minimum bank height");
            // 控制湖泊的最大河岸高度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_LAKE_MAX_BANK_HEIGHT), "The maximum bank height");
            // 控制湿地的常见程度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_WETLAND_CHANCE), "Controls how common wetlands are");
            // 控制湿地的最小尺寸
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_WETLAND_SIZE_MIN), "The minimum size of the wetlands");
            // 控制湿地的最大尺寸
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_WETLAND_SIZE_MAX), "The maximum size of the wetlands");
            // 控制每块地平均模拟的水滴数量
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_EROSION_DROPLETS_PER_CHUNK), "The average number of water droplets to simulate per chunk");
            // 控制单个水滴模拟的迭代次数
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_EROSION_DROPLET_LIFETIME), "Controls the number of iterations that a single water droplet is simulated for");
            // 控制模拟水滴的起始水量
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_EROSION_DROPLET_VOLUME), "Controls the starting volume of water that a simulated water droplet carries");
            // 控制模拟水滴的起始速度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_EROSION_DROPLET_VELOCITY), "Controls the starting velocity of the simulated water droplet");
            // 控制物质在侵蚀过程中溶解的速度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_EROSION_RATE), "Controls how quickly material dissolves (during erosion)");
            // 控制物质在侵蚀过程中沉积的速度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_DEPOSITE_RATE), "Controls how quickly material is deposited (during erosion)");
            // 控制平滑迭代的次数
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_SMOOTHING_ITERATIONS), "Controls the number of smoothing iterations");
            // 控制平滑的半径
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_SMOOTHING_RADIUS), "Controls the smoothing radius");
            // 控制平滑的应用强度
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_SMOOTHING_RATE), "Controls how strongly smoothing is applied");
            // 控制生成结构的网格大小
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_SPACING),
                    "Controls the size of the grid used to generate the structure. "
                            + "Structures will attempt to generate once per grid cell. Larger "
                            + "spacing values will make the structure appear less frequently."
            );
            // 控制结构实例之间的最小距离
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_SEPARATION),
                    "Controls the minimum distance between instances of the structure. "
                            + "Larger values guarantee larger distances between structures of the "
                            + "same type but cause them to generate more 'grid-aligned'. "
                            + "Lower values will produce a more random distribution but may allow "
                            + "instances to generate closer together."
            );
            // 控制山地地形设置为山地生态群系类型的概率
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_MOUNTAIN_BIOME_USAGE), "The probability that mountainous terrain will be set to a mountain biome type.\nThis may help improve compatibility with mods that rely exclusively on mountain biomes.");
            // 控制火山地形设置为火山生态群系类型的概率
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_VOLCANO_BIOME_USAGE), "The probability that volcano terrain will be set to a volcano biome type.\nThis may help improve compatibility with mods that rely exclusively on volcano biomes.");
            // 控制地层区域的大小
            this.add(Tooltips.translationKey(RTFTranslationKeys.GUI_SLIDER_STRATA_REGION_SIZE), "Controls the size of strata regions");
        }
    }
}
