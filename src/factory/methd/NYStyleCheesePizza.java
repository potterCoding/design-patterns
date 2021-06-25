package factory.methd;

/**
 * @author: Java伴我余生
 * @date: 2021-06-25
 * @description: 纽约风格奶酪比萨
 */
public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "纽约风味酱汁奶酪披萨";
		dough = "薄皮面团";
		sauce = "意大利西红柿酱";

		toppings.add("磨碎的雷吉亚诺奶酪");
	}
}
