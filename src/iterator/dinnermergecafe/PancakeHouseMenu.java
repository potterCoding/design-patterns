package iterator.dinnermergecafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: 小懒编程日记
 * @Description: 煎饼厅菜单重写
 * @Date: 16:08 2021-07-26
 */
public class PancakeHouseMenu implements Menu {

    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Deprecated
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        // return new PancakeHouseMenuIterator(menuItems);
        return menuItems.iterator();
    }

    public String toString() {
        return "Objectville Pancake House Menu";
    }
}
