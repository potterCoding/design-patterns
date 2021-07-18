package strategy;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-23
 * @description: 飞行行为的实现，给不会飞的鸭子使用
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞...");
    }
}
