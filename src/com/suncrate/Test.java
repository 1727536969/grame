package com.suncrate;

public class Test {

    public static void main(String[] args) {
        Weapon weapon =new Weapon("屠龙刀",999);
        Armour armour =new Armour("防御铠甲",100);

        Role role =new Role(1,1000,"张无忌");

        role.setArmour(armour);

        role.setWeapon(weapon);

        role.attack();

        role.wear();
    }
}
