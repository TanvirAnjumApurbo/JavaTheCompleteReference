package com.c07;

// Use varargs with standard arguments.
public class VarArgs2 {
    // Here message is normal parameter and v is a varargs parameter.
    static void vaTest(String message, int... v) {
        System.out.print(message + v.length + " Contents: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }
}

/*
 * One vararg: 1 Contents: 10
 * Three varargs: 3 Contents: 1 2 3
 * No varargs: 0 Contents:
 */