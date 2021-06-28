package factory.absfac;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 该接口负责创建所有的原料
 *
 * 该接口中的每个新类都代表一种原料
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
