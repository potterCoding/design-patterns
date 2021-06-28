Character(角色)是抽象类，由具体的角色继承，具体的角色包括：国王（King）、皇后（Queen）、
骑士（Knight）、妖怪（Troll）.而Weapon(武器)是接口，由具体的武器来实现。所有实际的角色
和武器的都是具体类。

任何角色如果想换武器，可以调用setWeapon()方法，此方法定义在Character超类中，在打斗（fight）
过程中，或调用到目前武器的useWeapon()方法，攻击其他角色。
