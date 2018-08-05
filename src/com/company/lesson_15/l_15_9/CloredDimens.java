package com.company.lesson_15.l_15_9;

import java.awt.*;

public class CloredDimens<T extends Dimension & HasColor> {

    T item;

    CloredDimens(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    Color getColor() {
        return item.getColor();
    }

    int getX () {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }
}
