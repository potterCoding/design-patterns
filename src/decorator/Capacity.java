package decorator;

/**
 * @author: Java伴我余生
 * @date: 2021-06-24
 * @description: 杯子容量
 */
public abstract class Capacity extends Beverage {
    //所有的调料装饰者都必须重新实现getDescription()方法
    public abstract String getDescription();
}
