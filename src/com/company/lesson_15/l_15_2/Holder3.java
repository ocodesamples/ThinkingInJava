package com.company.lesson_15.l_15_2;

import typeinfo.pets.Cat;
import typeinfo.pets.Pet;

public class Holder3<T> {

    T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] argc) {
        Holder3<Automobile>  h3= new Holder3<>(new Automobile());
        Automobile a = h3.get();  // No cast needed  不需要强转
        // h3.set("Not an Automobile") ; // Error
        // h3.set(1); // Error

        //练习题1： 配合typeInfo.pets类库，用Holder3来证明，如果指定Holder3可以持有某个基类类型，那么它
        //也能持有导出类型（子类）
        Holder3<Pet> petHolder3 = new Holder3<>(new Pet());
        petHolder3.set(new Cat());
        Cat s = (Cat) petHolder3.get();

    }
}
