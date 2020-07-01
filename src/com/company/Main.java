package com.company;

public class Main {
    public static void main(String[] args) {
       Magic magic = new Magic();
       Warrior warrior = new  Warrior();
       Medic medic = new Medic();

       Hero[] heroes = {magic, warrior, medic};

        for (Hero hero:heroes) {
            hero.applySuperAbility(SuperAbility.CRITICAL_DAMAGE);
        }
    }
}
