package com.company.lesson_5.l_5_1.tain;


public class Student {

    private String str;

    public boolean isNull() {
        return str == null ? true : false;
    }


    public static void main(String[] argc) {
        Student student = new Student();
        System.out.println(student.isNull());
    }
}
