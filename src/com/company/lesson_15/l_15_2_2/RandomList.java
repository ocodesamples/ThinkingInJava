package com.company.lesson_15.l_15_2_2;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {

    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] argc) {
        RandomList<String> rs = new RandomList<>();
        for(String s : ("The quick brown fox jumped over" + "The lazy dog").split(" ")) {
            rs.add(s);
        }

        for(int i = 0; i < 11; i++) {
            System.out.println(rs.select());
        }
    }
}
