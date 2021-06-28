package strategy.practice;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用大宝剑挥舞...");
    }
}
