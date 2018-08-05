package com.company.lesson_15.l_15_9;

public class Soild2<T extends  Dimension & HasColor & Weight>  extends ColoredDimension2<T> {

    Soild2(T item) {
        super(item);
    }

    int weight() {
        return item.weight();
    }
}
