package com.c07;

// Automatic type conversions apply to overloading.
class OverloadDemo2 {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }
}

public class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);// This will invoke test(double)
        ob.test(123.2); // This will invoke test(double)
    }
}

/*
 * No parameters
 * a and b: 10 20
 * Inside test(double) a: 88.0
 * Inside test(double) a: 123.2
 */