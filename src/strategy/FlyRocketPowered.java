package strategy;

/**
 * @author: Java伴我余生
 * @date: 2021-06-23
 * @description: 建立一个利用火箭动力的飞行行为
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("利用火箭动力飞行...");
    }
}
