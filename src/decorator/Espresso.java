package decorator;

/**
 * @author: Java伴我余生
 * @date: 2021-06-24
 * @description: 浓缩咖啡
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
