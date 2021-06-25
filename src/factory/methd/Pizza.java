package factory.methd;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	String name; //披萨名称
	String dough; // 面团
	String sauce; // 酱
	List<String> toppings = new ArrayList<String>(); // 佐料

	void prepare() {
		System.out.println("准备 " + name);
		System.out.println("揉面团...");
		System.out.println("加酱...");
		System.out.println("添加浇头: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}

	void bake() {
		System.out.println("在 350 度下烘烤 25 分钟");
	}

	void cut() {
		System.out.println("将披萨切成对角片");
	}

	void box() {
		System.out.println("将披萨放入官方 PizzaStore 盒子中");
	}

	public String getName() {
		return name;
	}

	public String toString() {
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



