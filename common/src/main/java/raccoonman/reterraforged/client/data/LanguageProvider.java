/*
 * Copyright (c) Forge Development LLC and contributors
 * SPDX-License-Identifier: LGPL-2.1-only
 */

// net/minecraftforge/common/data/LanguageProvider 的副本
package raccoonman.reterraforged.client.data;

import com.google.gson.JsonObject;

import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;

/**
 * LanguageProvider 类用于提供语言翻译，继承自 DataProvider。
 * 它的主要职责是收集各种翻译键和对应的翻译文本，并在数据生成过程中保存这些翻译到 JSON 文件中。
 */
public abstract class LanguageProvider implements DataProvider {
    // 存放翻译键和翻译文本的映射，使用 TreeMap 保持排序
    private final Map<String, String> data = new TreeMap<>();
    private final PackOutput output;
    private final String modid;
    private final String locale;

    /**
     * 构造函数初始化 LanguageProvider。
     *
     * @param output PackOutput 实例，用于输出数据。
     * @param modid  模组的 ID，用于确定翻译文件的保存位置。
     * @param locale 语言环境标识，例如 "en_us"。
     */
    public LanguageProvider(PackOutput output, String modid, String locale) {
        this.output = output;
        this.modid = modid;
        this.locale = locale;
    }

    /**
     * 添加翻译键和对应的翻译文本到 data 映射中。
     * 子类需要覆盖此方法来添加具体的翻译。
     */
    protected abstract void addTranslations();

    /**
     * 执行数据生成过程中的翻译保存操作。
     *
     * @param cache CachedOutput 实例，用于缓存输出。
     * @return CompletableFuture，表示异步操作的完成。
     */
    @Override
    public CompletableFuture<?> run(CachedOutput cache) {
        // 添加翻译
        this.addTranslations();

        // 如果有翻译数据，则保存到对应的语言文件中
        if (!this.data.isEmpty())
            return this.save(cache, this.output.getOutputFolder(PackOutput.Target.RESOURCE_PACK).resolve(this.modid).resolve("lang").resolve(this.locale + ".json"));

        // 如果没有翻译数据，则不执行任何操作
        return CompletableFuture.allOf();
    }

    /**
     * 获取此数据提供者的名称。
     *
     * @return 数据提供者的名称。
     */
    @Override
    public String getName() {
        return "Languages: " + locale;
    }

    /**
     * 保存翻译数据到指定路径的 JSON 文件中。
     *
     * @param cache CachedOutput 实例，用于缓存输出。
     * @param target 保存翻译数据的文件路径。
     * @return CompletableFuture，表示异步操作的完成。
     */
    private CompletableFuture<?> save(CachedOutput cache, Path target) {
        JsonObject json = new JsonObject();
        this.data.forEach(json::addProperty);
        return DataProvider.saveStable(cache, json, target);
    }

    /**
     * 添加方块的翻译。
     *
     * @param key 方块的 Supplier 函数式接口。
     * @param name 方块的翻译文本。
     */
    public void addBlock(Supplier<? extends Block> key, String name) {
        add(key.get(), name);
    }

    /**
     * 向某个集合或映射中添加一个键值对
     * 
     * @param key Block对象，作为键
     * @param name 与键关联的值，为字符串类型
     * 
     * 此方法通过调用自身的重载方法，使用Block对象的描述ID作为键来添加
     */
    public void add(Block key, String name) {
        add(key.getDescriptionId(), name);
    }

    /**
     * 添加物品的翻译。
     *
     * @param key 物品的 Supplier 函数式接口。
     * @param name 物品的翻译文本。
     */
    public void addItem(Supplier<? extends Item> key, String name) {
        add(key.get(), name);
    }

    /**
     * 向集合中添加一个项目，并指定其名称
     * 此方法通过调用另一个重载方法实现，使用项目的描述符ID作为键
     *
     * @param key  要添加的项目，包含描述符ID
     * @param name 项目的名字
     */
    public void add(Item key, String name) {
        add(key.getDescriptionId(), name);
    }

    /**
     * 添加物品堆的翻译。
     *
     * @param key 物品堆的 Supplier 函数式接口。
     * @param name 物品堆的翻译文本。
     */
    public void addItemStack(Supplier<ItemStack> key, String name) {
        add(key.get(), name);
    }

    /**
     * 向库存项中添加一个项目，并指定其名称
     * 此方法通过调用其超类的方法来实现功能，提供了一种间接的方式来添加项目
     * 它隐藏了底层的添加逻辑，使得使用这个方法的代码更加清晰和易读
     * 
     * @param key 要添加到库存的项目的钥匙，通常是一个物品堆栈对象
     * @param name 要为项目指定的名称，用于在库存中标识该项目
     */
    public void add(ItemStack key, String name) {
        add(key.getDescriptionId(), name);
    }

    /**
     * 添加附魔的翻译。
     *
     * @param key 附魔的 Supplier 函数式接口。
     * @param name 附魔的翻译文本。
     */
    public void addEnchantment(Supplier<? extends Enchantment> key, String name) {
        add(key.get(), name);
    }

    /**
     * 向某个功能或集合中添加一项映射，映射的键为Enchantment对象，值为名称
     * 
     * @param key Enchantment对象，作为映射的键
     * @param name 名称，作为映射的值
     * 此方法提供了一种方式，将Enchantment对象与一个特定的名称字符串相关联，可能是为了在游戏等应用中提供便捷的魔法或效果命名方式
     */
    public void add(Enchantment key, String name) {
        add(key.getDescriptionId(), name);
    }

    /**
     * 添加生物群系的翻译。
     *
     * @param key 生物群系的 Supplier 函数式接口。
     * @param name 生物群系的翻译文本。
     */
    //public void addBiome(Supplier<? extends Biome> key, String name) {
    //    add(key.get(), name);
    //}

    /**
     * 向某个生物群系添加本地化名称
     * 
     * @param key 生物群系的唯一标识，用于定位特定的生物群系
     * @param name 要添加的本地化名称
     */
    //public void add(Biome key, String name) {
    //    add(key.getTranslationKey(), name);
    //}

    /**
     * 添加效果的翻译。
     *
     * @param key 效果的 Supplier 函数式接口。
     * @param name 效果的翻译文本。
     */
    public void addEffect(Supplier<? extends MobEffect> key, String name) {
        add(key.get(), name);
    }

    /**
     * 将给定的药水效果与其自定义名称关联起来
     * 
     * @param key 药水效果的唯一标识，用于后续引用或操作该效果
     * @param name 药水效果的自定义名称，用于在界面上显示或在日志中记录
     */
    public void add(MobEffect key, String name) {
        add(key.getDescriptionId(), name);
    }

    /**
     * 添加实体类型的翻译。
     *
     * @param key 实体类型的 Supplier 函数式接口。
     * @param name 实体类型的翻译文本。
     */
    public void addEntityType(Supplier<? extends EntityType<?>> key, String name) {
        add(key.get(), name);
    }

    /**
     * 向存储映射中添加一个关联项
     * 
     * 此方法用于在特定的EntityType与一个字符串名称之间建立关联它接受EntityType类型的对象作为键，
     * 并将该键与给定的名称相关联这个过程是通过调用自身重载方法add实现的，该方法使用键的描述ID
     * 和给定的名称作为参数
     * 
     * @param key 实体类型的键，用于标识特定的EntityType对象
     * @param name 与键关联的字符串名称
     */
    public void add(EntityType<?> key, String name) {
        add(key.getDescriptionId(), name);
    }

    /**
     * 向 data 映射中添加翻译键和翻译文本。
     *
     * @param key 翻译键。
     * @param value 翻译文本。
     * 如果添加的翻译键已经存在，则抛出 IllegalStateException。
     */
    public void add(String key, String value) {
        if (data.put(key, value) != null)
            throw new IllegalStateException("Duplicate translation key " + key);
    }
}
