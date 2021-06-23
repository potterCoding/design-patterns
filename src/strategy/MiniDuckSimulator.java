package strategy;
/**
 * @author: Java伴我余生
 * @date: 2021-06-23
 * @description: 测试
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("--------模型鸭测试-------");

        Duck model = new ModelDuck();
        // 第一次调用performFly()会被委托给FlyNoWay对象，该对象是模型鸭构造器中设置得
        model.performFly();
        // 这里会调用继承来的setter方法，把火箭动力飞行的行为设定到模型鸭中
        model.setFlyBehavior(new FlyRocketPowered());
        // 模型鸭突然具有飞行能力
        model.performFly(); // 说明模型鸭动态地改变行为
    }

}
