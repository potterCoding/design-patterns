package decorator;

/**
 * @author: Java伴我余生
 * @date: 2021-06-24
 * @description: 大豆调料
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 大豆";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
