package com.c02;

import java.io.PrintStream;

public class FirstProgram {
    public static void main(String[] args) {
        // Accessing the static field 'out' of the System class
        PrintStream ps = System.out;
        /*
         * System class in Java cannot be instantiated because its constructor is
         * private.
         */

        // Calling the 'print' method on the PrintStream instance
        ps.print("Hello, World!");
    }
}

/*
 * Hello, World!
 */
