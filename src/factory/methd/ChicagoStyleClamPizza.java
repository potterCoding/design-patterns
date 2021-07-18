package factory.methd;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-25
 * @description: 芝加哥风味蛤蜊披萨
 */
public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "Chicago Style Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Frozen Clams from Chesapeake Bay");
	}

	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
