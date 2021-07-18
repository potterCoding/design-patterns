package factory.absfac;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-28
 * @description: 重做蛤蜊披萨
 */
public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		// 如果是纽约原料工厂，就会使用新鲜蛤蜊
		// 如果是芝加哥原料工厂，则会使用冷冻的蛤蜊
		clam = ingredientFactory.createClam();
	}
}
