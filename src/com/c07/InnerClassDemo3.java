package com.c07;

// Define an inner class within a for loop.
class Outer3 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner3 {
                void display() {
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner3 inner = new Inner3();
            inner.display();
        }
    }
}

public class InnerClassDemo3 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.test();
    }
}

/*
 * display: outer_x = 100
 * display: outer_x = 100
 * display: outer_x = 100
 * display: outer_x = 100
 * display: outer_x = 100
 * display: outer_x = 100
 * display: outer_x = 100
 * display: outer_x = 100
 * display: outer_x = 100
 * display: outer_x = 100
 */