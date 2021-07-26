package iterator.dinnermergecafe;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: 小懒编程日记
 * @Description: 改造女招待
 * @Date: 16:32 2021-07-26
 */
public class WaitressPlus {
    ArrayList menus;

    public WaitressPlus(ArrayList menus) {
        this.menus = menus;
    }

    /**
     * 遍历菜单，把每个菜单的迭代器传给重载的printMenu()
     */
    public void printMenu(int withNewConstructs) {
        Iterator iterator = menus.iterator();
        while (iterator.hasNext()) {
            Menu menu = (Menu) iterator.next();
            printMenu(menu.createIterator());
        }
    }

    /**
     * 该方法的代码不需要改变
     */
    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
