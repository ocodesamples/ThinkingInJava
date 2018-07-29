package com.company.lesson_15.l_15_2_1;

public class TwoTuple<A, B> {

    private A first;
    private B second;

    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
    }


    @Override
    public String toString() {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

class ThreeTuple<A,B,C> extends TwoTuple<A, B> {

    public final C third;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;

    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "third=" + third +
                '}';
    }
}

class  FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {

    public final D fourth;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        fourth = d;
    }


}


class Amphibian{}
class Veice{}

class TupleTest {

    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("Hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(),"Hi", 47);
    }

    static FourTuple<Veice, Amphibian, String ,Integer > h() {
        return new FourTuple<>(new Veice(), new Amphibian(), "Hi", 47);
    }

    public static void main(String[] argc) {
        TwoTuple<String, Integer> ttsi = f();
        // ttsi.first = "there";   // Compile error:final
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());
    }

}