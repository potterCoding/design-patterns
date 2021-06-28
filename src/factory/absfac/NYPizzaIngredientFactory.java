package factory.absfac;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 纽约的原料工厂实现
 * 这工厂专精于大蒜番茄酱料、Reggiano 干酪、新鲜蛤蜊...
 *
 * 对于原料家族内的每一种原料，我们都提供了纽约版本
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	/**
	 * 对于蔬菜，以一个蔬菜数组为返回值。
	 * 在这里我们是直接将蔬菜写死
	 * @return
	 */
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		// 这是切片的意式腊肠
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		// 纽约靠海，所以有新鲜的蛤蜊，芝加哥就必须使用冷冻的蛤蜊
		return new FreshClams();
	}
}
