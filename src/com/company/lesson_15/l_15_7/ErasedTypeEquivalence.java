package com.company.lesson_15.l_15_7;

import java.util.ArrayList;

public class ErasedTypeEquivalence {

    public static void main(String[] argc) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();

        System.out.println(c1 == c2);
    }
}
