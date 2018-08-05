package com.company.lesson_15.l_15_9;

public class HoldItem<T> {

    T item;

    HoldItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}
