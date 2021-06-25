package decorator;

/**
 * @author: Java伴我余生
 * @date: 2021-06-24
 * @description: 饮料
 */
public abstract class Beverage {
    // 饮料介绍
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    // 饮料费用
    public abstract double cost();
}
