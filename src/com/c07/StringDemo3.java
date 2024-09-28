package com.c07;

// Demonstrate a String array.
public class StringDemo3 {
    public static void main(String[] args) {
        String[] str = {"one", "two", "three"};

        for (int i = 0; i < str.length; i++) {
            System.out.println("str[" + i + "] is " + str[i]);
        }
    }
}

/*
 * str[0] is one
 * str[1] is two
 * str[2] is three
 */