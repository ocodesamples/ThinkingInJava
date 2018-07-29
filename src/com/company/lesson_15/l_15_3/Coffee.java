package com.company.lesson_15.l_15_3;

import java.util.Iterator;
import java.util.Random;

public class Coffee {

    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "  " + id;
    }

  public static  class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

        private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, AmeriCano.class, Breve.class};

        private static Random rand = new Random(47);

        private int size = 0;

        public CoffeeGenerator() {

        }

        public CoffeeGenerator(int cz) {
            this.size = cz;
        }

        @Override
        public Coffee next() {
            try {
                return (Coffee) types[rand.nextInt(types.length)].newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public Iterator<Coffee> iterator() {
            return new CoffeeIterator();
        }

        class CoffeeIterator implements Iterator<Coffee> {

            int count = size;

            @Override
            public boolean hasNext() {
                System.out.println("hasnest ");
                return count > 0;
            }

            @Override
            public Coffee next() {
                System.out.println("next");
                count--;
                return CoffeeGenerator.this.next();
            }
        }


        public static void main(String[] argc) {
            CoffeeGenerator gen = new CoffeeGenerator();
            for(int i = 0; i < 5; i++ )
                System.out.println(gen.next());

            for (Coffee c : new CoffeeGenerator(5)) {
                System.out.println(c);
            }
        }
    }
}

class Latte extends Coffee {}

class Mocha extends Coffee {}

class Cappuccino extends Coffee{}

class AmeriCano extends  Coffee {}

class Breve extends Coffee {}

