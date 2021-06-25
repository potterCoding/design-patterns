package decorator;

/**
 * @author: Java伴我余生
 * @date: 2021-06-24
 * @description: 中杯
 */
public class MediumCup extends Capacity {

    Beverage beverage;

    public MediumCup(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 中杯";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
