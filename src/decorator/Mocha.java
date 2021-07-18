package decorator;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-24
 * @description: 摩卡调料
 *
 * 要让Mocha能够引用一个Beverage，做法如下：
 * 1、用一个实例变量记录记录饮料，也是就是被装饰着
 * 2、想办法让被装饰者（饮料）被记录到实例变量中
 * 这里的做法是：把饮料当作构造器的参数，再由构造器将此饮料记录在实例变量中
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 我们希望叙述不只是描述饮料（例如“深焙咖啡”），
        // 而是完整地连调料都描述出来（例如“深焙咖啡, 摩卡”）。
        // 所以首先利用委托的做法，得到一个叙述，然后在其后加上附加的叙述（例如“摩卡”）。
        return beverage.getDescription() + ", 摩卡";
    }

    @Override
    public double cost() {
        // 要计算带摩卡饮料的价钱。首先把调用委托给被装饰对象，以计算价钱，
        // 然后再加上摩卡的价钱，得到最后结果
        return .20 + beverage.cost();
    }
}
