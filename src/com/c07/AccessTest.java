package com.c07;

// This program demonstrates the use of access control modifiers.

class Test5 {
    int a; // default access
    public int b; // public access
    private int c; // private access

    // methods to access c
    public void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();

        ob.a = 10;
        ob.b = 20;

        // This is invalid and will cause an error
        // ob.c=100; // Error!

        // You must access c through its methods
        ob.setc(100);
        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}

/*
 * a, b, and c: 10 20 100
 */