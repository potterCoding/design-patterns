package factory.absfac;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 重做披萨
 */
public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	/**
	 * 要制作披萨，需要工厂提供原料。
	 * 所以每个披萨类都需要从构造器参数中得到偶一个原料工厂，
	 * 并将这个工厂存储到一个实例变量中
	 * @param ingredientFactory
	 */
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	/**
	 * 创建披萨，需要原料就向工厂要
	 */
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
