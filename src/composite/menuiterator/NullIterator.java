package composite.menuiterator;


import java.util.Iterator;

/**
 * @Author: 小懒编程日记
 * @Description: 空迭代器
 * @Date: 16:56 2021-07-26
 */
public class NullIterator implements Iterator<MenuComponent> {
    public MenuComponent next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }
}
