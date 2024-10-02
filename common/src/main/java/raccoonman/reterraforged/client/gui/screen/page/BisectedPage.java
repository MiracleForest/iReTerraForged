package raccoonman.reterraforged.client.gui.screen.page;

import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.screens.Screen;
import raccoonman.reterraforged.client.gui.ColumnAlignment;
import raccoonman.reterraforged.client.gui.screen.page.LinkedPageScreen.Page;
import raccoonman.reterraforged.client.gui.widget.WidgetList;

/**
 * @brief 抽象类BisectedPage，用于创建分为左右两列的GUI页面。
 * BisectedPage是一个泛型类，其中S代表屏幕类型，L和R分别代表左右两列的小部件类型。
 */
public abstract class BisectedPage<S extends Screen, L extends AbstractWidget, R extends AbstractWidget> implements Page {
    /**
     * @brief 当前屏幕的引用。
     */
    protected S screen;

    /**
     * @brief 左侧的小部件列表。
     */
    protected WidgetList<L> left;

    /**
     * @brief 右侧的小部件列表。
     */
    protected WidgetList<R> right;

    /**
     * @brief 构造函数，初始化屏幕引用。
     *
     * @param screen 当前屏幕对象。
     */
    public BisectedPage(S screen) {
        this.screen = screen;
    }

    /**
     * @brief 初始化方法，用于设置页面布局。
     * 创建左右两列，并使用ColumnAlignment来管理布局。
     */
    @Override
    public void init() {
        // 创建列对齐管理器，用于安排屏幕内容的布局
        ColumnAlignment alignment = new ColumnAlignment(this.screen, 4, 0, 10, 30);
        // 向列对齐管理器添加一个宽度占比为0.7的左列，并设置列的创建和定位逻辑
        this.left = alignment.addColumn(0.7F, this::createAndPositionColumn);
        // 向列对齐管理器添加一个宽度占比为0.3的右列，并设置列的创建和定位逻辑
        this.right = alignment.addColumn(0.3F, this::createAndPositionColumn);
    }

    /**
     * @brief 私有方法，用于创建和定位小部件列。
     *
     * @param left 列的左边距。
     * @param top 列的顶部边距。
     * @param columnWidth 列的宽度。
     * @param height 列的高度。
     * @param horizontalPadding 列的水平内边距。
     * @param verticalPadding 列的垂直内边距。
     * @return 创建并定位好的小部件列表。
     */
    private <T extends AbstractWidget> WidgetList<T> createAndPositionColumn(int left, int top, int columnWidth, int height, int horizontalPadding, int verticalPadding) {
        // 外边距
        final int padding = 30;
        // 每个槽位的高度
        final int slotHeight = 25;
        // 创建一个新的WidgetList对象用于存放和管理小部件
        // this.screen.minecraft：获取Minecraft实例，可能用于渲染或事件处理
        // columnWidth：小部件列表的宽度
        // height：小部件列表的高度
        // padding：列表外边距
        // height - padding：列表内部可用的高度
        // slotHeight：每个小部件（或槽位）的高度
        WidgetList<T> list = new WidgetList<>(this.screen.minecraft, columnWidth, height, padding, height - padding, slotHeight);
        // 设置列的左边位置
        list.setLeftPos(left);
        return list;
    }
}