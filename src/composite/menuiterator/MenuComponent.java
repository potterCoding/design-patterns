package composite.menuiterator;

import java.util.Iterator;

/**
 * @Author: 小懒编程日记
 * @Description: 对每个方法都提供默认实现
 * 1.所有组件都必须实现MenuComponent接口
 * 2.叶节点和组合节点的角色各不同
 *
 * @Date: 16:38 2021-07-26
 */
public abstract class MenuComponent {
    // 添加菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    // 删除菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    // 获取菜单项的子菜单
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // 获取菜单名称
    public String getName() {
        throw new UnsupportedOperationException();
    }
    // 获取菜单介绍
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    // 获取菜单价格
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    // 该菜单项是否为素食
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<MenuComponent> createIterator();
}
