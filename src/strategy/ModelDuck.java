package strategy;

/**
 * @author: Java伴我余生
 * @date: 2021-06-23
 * @description: 模型鸭
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay(); // 一开始，我们的模型鸭是不能飞的
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一只模型鸭...");
    }
}
