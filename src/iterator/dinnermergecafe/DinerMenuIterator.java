package iterator.dinnermergecafe;

import java.util.Iterator;

/**
 * @Author: 小懒编程日记
 * @Description: 为餐厅菜单服务的具体迭代器
 * @Date: 15:50 2021-07-26
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0; // 记录当前数组遍历的位置

    // 构造器需要被传入一个菜单项的数组当作参数
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    /**
     * 检查我们是否已经取得数组内的所有元素
     */
    @Override
    public boolean hasNext() {
        // 因为使用的是固定长度的数组，如果是null，就表示没有其他项了
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    /**
     * 返回数组内的下一个元素，并递增其位置
     */
    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position = position + 1;
        return item;
    }
}
