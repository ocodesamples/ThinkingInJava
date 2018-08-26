package com.company.lesson_5.l_5_1.tain;

public class Student2 {

    private String str = "小明";
    private String ss ;

    public Student2(String mS) {
        this.ss = mS;
    }

    public boolean isNull() {
        return str == null ? true : false;
    }


    public static void main(String[] argc) {
        //却别是构造函数可以改变类变量，而不在构造函数的类变量初始化无法改变
        Student2 student = new Student2("哈哈");
        System.out.println(student.isNull());
    }
}
