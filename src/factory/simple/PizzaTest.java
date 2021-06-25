package factory.simple;

public class PizzaTest {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        // 芝士披萨
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("我们预订了一份： " + pizza.getName() + "\n");
        System.out.println(pizza);

        // 蔬菜披萨
        pizza = store.orderPizza("veggie");
        System.out.println("我们预订了一份： " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
