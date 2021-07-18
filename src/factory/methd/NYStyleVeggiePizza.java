package factory.methd;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-25
 * @description: 纽约时尚素食比萨
 */
public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {
		name = "NY Style Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Cheese");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Pepper");
	}
}
