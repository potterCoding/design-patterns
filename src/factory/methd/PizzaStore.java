package factory.methd;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-25
 * @description: 披萨店
 * 使用工厂方法实现加盟店销售披萨的问题
 */
public abstract class PizzaStore {

    // 1.工厂方法是抽象的，所以依赖子类来处理对象的创建
    // 2.工厂方法必须返回一个产品，超类中定义的方法，通常使用到工厂方法的返回值
    // 3.工厂方法将客户（也就是超类中的代码，例orderPizza()）和实际创建具体产品的代码分割开来
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- 制作一个 " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

/**
 * 工厂方法用来处理对象的创建，并将这样的行为封装在子类中。
 * 这样，客户程序中关于超类的代码就和子类对象创建代码解耦了
 */
