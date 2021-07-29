package iterator.dinnermergecafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: 小懒编程日记
 * @Description: 咖啡厅菜单
 * @Date: 16:16 2021-07-26
 */
public class CafeMenu implements Menu {
    HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    /**
     * 不再使用该方法获取菜单信息
     */
    @Deprecated
    public Map<String, MenuItem> getItems() {
        return menuItems;
    }

    /**
     * 使用迭代器方式获取菜单
     */
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }

}
