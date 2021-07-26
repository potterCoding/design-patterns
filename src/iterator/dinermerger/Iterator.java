package iterator.dinermerger;

/**
 * @Author: 小懒编程日记
 * @Description: 在餐厅菜单中加入一个迭代器
 * @Date: 15:48 2021-07-26
 */
public interface Iterator<M> {
    boolean hasNext();
    Object next();
}
