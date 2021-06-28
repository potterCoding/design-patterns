package strategy.practice;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
