package com.company.lesson_15.l_15_9;

public class InheritBounds {

    public static void main(String[] argc) {
        Soild2<Bounded> soild2 = new Soild2<>(new Bounded());
        soild2.color();
        soild2.getY();
        soild2.weight();
    }
}
