package composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: 小懒编程日记
 * @Description: 菜单和菜单项一样，都是MenuComponent
 * @Date: 16:43 2021-07-26
 */
public class Menu extends MenuComponent {
    // 菜单可以拥有任意数量的菜单项，这些孩子都必须属于MenuComponent类型
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        // 使用迭代器，用它遍历所有菜单组件，在遍历过程中，可能会由其他菜单，或是遇到菜单项
        // 由于菜单和菜单项都实现了print()方法，我们只需要调用menuComponents的print()方法即可
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent =
                    (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
