package decorator;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-24
 * @description: 调料
 * 首先必须将Condiment能够取代Beverage，所以将Condiment扩展自Beverage
 */
public abstract class CondimentDecorator extends Beverage {

    //所有的调料装饰者都必须重新实现getDescription()方法
    public abstract String getDescription();
}
