package com.company.lesson_15.l_15_4_4;

import com.company.lesson_15.l_15_3.Generator;

public class BasicGeneratpr<T> implements Generator<T> {

    private Class<T> type;

    public BasicGeneratpr(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGeneratpr<T>(type);
    }
}
