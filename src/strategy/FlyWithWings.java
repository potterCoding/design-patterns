package strategy;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-23
 * @description: 飞行行为的实现，给[真会]飞的鸭子使用
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我飞起来了...");
    }
}
