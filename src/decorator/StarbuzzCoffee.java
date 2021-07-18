package decorator;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-24
 * @description: 点咖啡的测试类
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        // 点一杯浓缩咖啡，不需要调料，打印描述和价格
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        // 点一杯深焙咖啡，加双份摩卡，一份奶油调料
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // 点一杯综合咖啡，加一份大豆、一份摩卡、一份奶油调料
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        // 点一小杯浓缩咖啡，不需要调料，打印描述和价格
        beverage1 = new SmallCup(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    }

}
