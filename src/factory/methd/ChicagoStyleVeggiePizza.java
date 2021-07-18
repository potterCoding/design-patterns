package factory.methd;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-25
 * @description: 芝加哥风味素食比萨
 */
public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Deep Dish Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}

	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
