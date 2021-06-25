package factory.methd;

/**
 * @author: Java伴我余生
 * @date: 2021-06-25
 * @description: 芝加哥风味意大利辣香肠比萨
 */
public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}

	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
