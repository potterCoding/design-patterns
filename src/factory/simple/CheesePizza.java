package factory.simple;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-25
 * @description: 芝士披萨
 */
public class CheesePizza extends Pizza {
	public CheesePizza() {
		name = "芝士披萨";
		dough = "普通地壳";
		sauce = "马里纳拉比萨酱";
		toppings.add("新鲜马苏里拉");
		toppings.add("巴马干酪");
	}
}
