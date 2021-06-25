package factory.simple;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name; //披萨名称
    String dough; // 面团
    String sauce; // 酱
    List<String> toppings = new ArrayList<String>(); // 浇片

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("准备 " + name);
    }

    public void bake() {
        System.out.println("烘烤 " + name);
    }

    public void cut() {
        System.out.println("切割 " + name);
    }

    public void box() {
        System.out.println("包装 " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
