package decorator;

/**
 * @author: Java伴我余生
 * @date: 2021-06-24
 * @description: 小杯
 */
public class SmallCup extends Capacity {

    Beverage beverage;

    public SmallCup(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 小杯";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
