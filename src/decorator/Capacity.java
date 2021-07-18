package decorator;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-24
 * @description: 杯子容量
 */
public abstract class Capacity extends Beverage {
    //所有的调料装饰者都必须重新实现getDescription()方法
    public abstract String getDescription();
}
