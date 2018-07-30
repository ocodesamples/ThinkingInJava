package com.company.lesson_15.l_15_8;

public class Erased<T> {

    private final static int SIZE = 100;

    public static void f(Object arg) {
       // if(arg instanceof T) {}  //Error
       // T var = new T();   //Error
      // T[] array = new T[SIZE];  //Error
       // T[] aray = (T)new Object[SIZE]; //Error
    }
}
