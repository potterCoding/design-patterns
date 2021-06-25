package decorator;

public class BigCup extends Capacity {

    Beverage beverage;

    public BigCup(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 大杯";
    }

    @Override
    public double cost() {
        return 0.5 + beverage.cost();
    }
}
