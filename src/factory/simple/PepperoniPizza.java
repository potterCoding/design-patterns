package factory.simple;

/**
 * @author: Java伴我余生
 * @date: 2021-06-25
 * @description: 意大利辣香肠比萨
 */
public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		name = "意大利辣香肠比萨";
		dough = "面包皮";
		sauce = "意大利西红柿酱";
		toppings.add("意大利辣香肠切片");
		toppings.add("洋葱片");
		toppings.add("磨碎的帕尔马干酪");
	}
}
