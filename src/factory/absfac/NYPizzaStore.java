package factory.absfac;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 重做纽约披萨店
 */
public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		// 纽约店会用到纽约披萨原料工厂
		// 由该原料工厂负责生产所有纽约风味比萨所需要的原料
		PizzaIngredientFactory ingredientFactory =
			new NYPizzaIngredientFactory();

		if (item.equals("cheese")) {
			// 把工厂传递给每一个纽约比萨，以便披萨能从工厂中取得原料
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");

		}
		return pizza;
	}
}
