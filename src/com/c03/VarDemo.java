package com.c03;

public class VarDemo {
    public static void main(String[] args) {

        var avg = 10.0; // double is inferred
        System.out.println("Value of avg: " + avg);

        int var = 1;
        System.out.println("Value of var: " + var);

        var k = -var;
        System.out.println("Value of k: " + k);

        var myArray = new int[10]; // Can also declare array

        // var[] myArray = new int[10]; Wrong
        // var myArray[] = new int[10]; Wrong
        // var myArray={1,2,3}; Wrong
    }
}

/*
 * Value of avg: 10.0
 * Value of var: 1
 * Value of k: -1
 */
