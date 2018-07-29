package com.company.lesson_15.l_15_4_4;

import com.company.lesson_15.l_15_3.Generator;

public class BasicGeneratorDome {

    public static void main(String[] argc) {
        Generator<CountedObject> gen =  BasicGeneratpr.create(CountedObject.class);
        for(int i = 0; i < 5; i++) {
            System.out.println(gen.next()+"============");
        }
    }
}
