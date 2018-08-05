package com.company.lesson_15.l_15_9;

public class SuperHero<POWER extends SuperPower> {

    POWER power;

    SuperHero(POWER power) {
        this.power = power;
    }

    POWER getPower() {
        return power;
    }
}
