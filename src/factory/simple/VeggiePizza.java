package factory.simple;

/**
 * @author: Java伴我余生
 * @date: 2021-06-25
 * @description: 素食比萨
 */
public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		name = "素食比萨";
		dough = "脆皮";
		sauce = "意大利西红柿酱";
		toppings.add("马苏里拉芝士碎");
		toppings.add("磨碎的帕尔马干酪");
		toppings.add("洋葱丁");
		toppings.add("蘑菇片");
		toppings.add("切碎的红辣椒");
		toppings.add("黑橄榄切片");
	}
}
