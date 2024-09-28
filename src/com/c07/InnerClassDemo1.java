package com.c07;

class Outer1 {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // this is an inner class
    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}

public class InnerClassDemo1 {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.test();
    }
}

/*
 * display: outer_x = 100
 */