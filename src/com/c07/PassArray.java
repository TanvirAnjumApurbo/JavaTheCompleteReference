package com.c07;

// Use an array to pass a variable number of arguments to a method. This is a old-style approach to variable-length arguments.
public class PassArray {
    static void vaTest(int[] v) {
        System.out.print("Number of args: " + v.length + " Contents: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Notice how an array must be created to hold the arguments.
        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = {};

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}

/*
 * Number of args: 1 Contents: 10
 * Number of args: 3 Contents: 1 2 3
 * Number of args: 0 Contents:
 */