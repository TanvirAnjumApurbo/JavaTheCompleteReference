package com.c07;

// Primitive types are passed by value.

class Test2 {
    void math_(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test2 ob = new Test2();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.math_(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }
}

/*
 * a and b before call: 15 20
 * a and b after call: 15 20
 */