package com.c07;

class Counter {
    // Static field
    static int count = 0;

    // Instance field
    int instanceCount = 0;

    // Constructor
    public Counter() {
        count++; // Increment static field
        instanceCount++; // Increment instance field
    }
}

public class StaticFieldGPT {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Static count: " + Counter.count);
        System.out.println("Instance count of c1: " + c1.instanceCount);
        System.out.println("Instance count of c2: " + c2.instanceCount);
        System.out.println("Instance count of c3: " + c3.instanceCount);
    }
}

/*
 * Static count: 3
 * Instance count of c1: 1
 * Instance count of c2: 1
 * Instance count of c3: 1
 */