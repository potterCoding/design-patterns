package decorator;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-24
 * @description: 综合咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "综合咖啡";
    }

    @Override
    public double cost() {
        return .89;
    }
}
