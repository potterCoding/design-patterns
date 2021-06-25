package decorator;

/**
 * @author: Java伴我余生
 * @date: 2021-06-24
 * @description: 奶油调料
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 奶油";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
