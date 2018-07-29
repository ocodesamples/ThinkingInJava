package com.company.lesson_15.l_15_5;

import com.company.lesson_15.l_15_3.Generator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BankTeller {

    public static void serve(Teller t, Customer c) {
        System.out.println(t+" serves  "+ c);
    }

    public static void main(String[] argc) {
        Random rand = new Random(47);
        Queue<Customer> line = new LinkedList<>();
//        Generator.
    }
}
