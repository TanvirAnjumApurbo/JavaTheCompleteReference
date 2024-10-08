package com.c03;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 2_57;
        double d = 323.1_42;

        System.out.println("\nConversion of int to byte:");
        b = (byte) i;
        System.out.println("i and b " + i + "   " + b);

        System.out.println("\nConversion of double to int:");
        i = (int) d;
        System.out.println("d and i " + d + "   " + i);

        System.out.println("\nConversion of double to byte:");
        b = (byte) d;
        System.out.println("d and b " + d + "   " + b);

        // byte b1 = 50;
        // b1 = (byte) (b1 * 2);
    }
}

/*
 * Conversion of int to byte:
 * i and b 257 1
 *
 * Conversion of double to int:
 * d and i 323.142 323
 *
 * Conversion of double to byte:
 * d and b 323.142 67
 */
