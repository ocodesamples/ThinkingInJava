package com.company.lesson_15.l_15_4_4;

public class CountedObject {

    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    public String toString() {
        return "CountedObject" + id;
    }
}
