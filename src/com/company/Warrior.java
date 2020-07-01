package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility(SuperAbility superAbility) {
        System.out.println("Warrior применил суперспособность " + superAbility);
    }
}
