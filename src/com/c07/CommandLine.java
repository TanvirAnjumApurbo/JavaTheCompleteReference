package com.c07;

// Display all command-line arguments.
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}

/*
 * PS C:\Users\Apurb\OneDrive\Desktop\TheCompleteReference\bin> java CommandLine
 * this is a test 100 -1
 * args[0]: this
 * args[1]: is
 * args[2]: a
 * args[3]: test
 * args[4]: 100
 * args[5]: -1
 */