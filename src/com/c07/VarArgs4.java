package com.c07;

// Varargs, overloading, and ambiguity.
public class VarArgs4 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int...): " + "Number of args: " + v.length + " Contents: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean...): " + "Number of args: " + v.length + " Contents: ");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
        // vaTest(); // Error: Ambiguous!

        // static void vaTest(int... v) {...
        // static void vaTest(int n, int... v) {...
        // vaTest(1); // Error: Ambiguous!
    }
}

/*
 * vaTest(int...): Number of args: 3 Contents: 1 2 3
 * vaTest(boolean...): Number of args: 3 Contents: true false false
 */