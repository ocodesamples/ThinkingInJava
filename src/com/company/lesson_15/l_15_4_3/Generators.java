package com.company.lesson_15.l_15_4_3;

import com.company.lesson_15.l_15_3.Coffee;
import com.company.lesson_15.l_15_3.Fibonacci;
import com.company.lesson_15.l_15_3.Generator;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen , int n) {
        for(int i = 0; i  < n ; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] argc) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new Coffee.CoffeeGenerator(), 4);
        for(Coffee c : coffees) {
            System.out.println(c);
        }

        Collection<Integer> fnumber = fill(new ArrayList<Integer>(), new Fibonacci(), 21);

        for(int i : fnumber) {
            System.out.println(i+",");
        }
    }

}
