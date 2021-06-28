package strategy.practice;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用匕首刺杀...");
    }
}
