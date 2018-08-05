package com.company.lesson_15.l_15_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperSleuth<POWER extends  XRayVision> extends SuperHero<POWER> {

    SuperSleuth(POWER power) {
        super(power);
        List<? extends String>  dd = Arrays.asList(new String("ddddddd"));
    }


    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static List<CharSequence>  a = new ArrayList<>();
    static List<String> b = new ArrayList<>();

    public void aa(List<? super String> aa) {
        writeExact(a, new String("sss"));
        writeExact(b, new String("ddd"));
    }
}
