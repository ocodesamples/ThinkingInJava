package com.company.lesson_15.l_15_5;

import com.company.lesson_15.l_15_3.Generator;

public class Teller {

    private static long counter = 1;
    private final long id = counter++;

    private Teller() {}

    @Override
    public String toString() {
        return " Teller" + id;
    }

    public static Generator<Teller> generator = new Generator<Teller>() {
        @Override
        public Teller next() {
            return new Teller();
        }
    };
}
