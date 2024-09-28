package com.c07;

public class StaticBlockGPT {
    // Static field
    static int value;

    // Static block
    static {
        value = 10;
        System.out.println("Static block executed. Value: " + value);
    }

    public static void main(String[] args) {
        // Accessing the static field
        System.out.println("Value in main: " + StaticBlockGPT.value);
    }
}

/*
 * Static block executed. Value: 10
 * Value in main: 10
 */