package decorator;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-24
 * @description: 深焙咖啡
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "深焙咖啡";
    }

    @Override
    public double cost() {
        return .99;
    }
}
