package composite.menuiterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    /**
     * 将我们要遍历的顶层组合的迭代器传入，我们把它放进一个堆栈数据结构中
     */
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    /**
     * 当客户想要取得下一个元素的时候，我们先调用hasNext()来确定是否还有下一个
     * 如果还有下一个元素，我们就从堆栈中去除当前的迭代器，然后取得它的下一个元素
     */
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
}
