package com.company.lesson_15.l_15_9;

import java.awt.*;

public class Colored2<T extends HasColor>  extends  HoldItem<T>{

    Colored2(T item) {
        super(item);
    }

    Color color() {
        return item.getColor();
    }
}
