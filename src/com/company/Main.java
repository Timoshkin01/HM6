package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(40);
        Weapon weapon = new Weapon("Pistolet", "mini");
        boss.setWeapon(weapon);
        System.out.println(boss.info());

        Sceleton sceleton = new Sceleton();
        sceleton.setNumbersOfArrows(10);
        sceleton.setHealth(150);
        sceleton.setDamage(30);

        Weapon weapon1 = new Weapon("Bow", "Arrows");
        sceleton.setWeapon(weapon1);
        System.out.println(sceleton.info());

        Sceleton sceletonchik = new Sceleton();
        sceletonchik.setHealth(140);
        sceletonchik.setDamage(10);
        sceletonchik.setNumbersOfArrows(20);

        Weapon weapon2 = new Weapon("SuperBow", "EnchantedArrows");
        sceletonchik.setWeapon(weapon2);
        System.out.println(sceletonchik.info());


    }
}
