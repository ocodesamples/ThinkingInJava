package com.company.lesson_15.l_15_4;

import com.company.lesson_15.l_15_3.Generator;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public <T> void a(List<T> s) {
        s.add((T) "ssssss");

        for(int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i)+"=======dd");
        }
    }


    public static void main(String[] argc) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0f);
        gm.f('c');
        gm.f(gm);

        gm.a(new ArrayList<>());
    }


}
