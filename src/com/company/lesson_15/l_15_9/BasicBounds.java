package com.company.lesson_15.l_15_9;

public class BasicBounds {

    public static void main(String[] argc) {
        Solid<Bounded> slid = new Solid<>(new Bounded());
        slid.getColor();
        slid.getY();
        slid.weight();
    }
}
