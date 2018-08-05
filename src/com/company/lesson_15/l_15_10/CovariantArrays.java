package com.company.lesson_15.l_15_10;

import java.util.ArrayList;
import java.util.List;

public class CovariantArrays {

    public static void main (String[] argc) {
        Fruit[] fruits = new Apple[10];

        fruits[0] = new Apple();  //ok

        fruits[0] = new Jonathan(); // ok

     //   fruits[0]  = new Fruit(); //运行时异常

      //  fruits[0] = new Orange();


        //List<Fruit>  flist = new ArrayList<Apple>();编译失败
    }
}
