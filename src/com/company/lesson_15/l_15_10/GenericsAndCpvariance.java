package com.company.lesson_15.l_15_10;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCpvariance {

    public static void main(String[] argc) {
        // WildCaeds allow covariance

        List<? extends Fruit>  fruits = new ArrayList<Apple>();

        //编译失败不能增加任何类型对象
        // fruits.add(new Apple());
        //  fruits.add(new Fruit());
        // fruits.add(new Object());

        fruits.add(null);
        Fruit f = fruits.get(0);

    }
}
