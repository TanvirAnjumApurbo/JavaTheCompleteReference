package com.c07;

class MathUtils {
    // Static method
    public static int add(int a, int b) {
        return a + b;
    }

    // Instance method
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class StaticMethodGPT {
    public static void main(String[] args) {
        // Call static method
        int sum = MathUtils.add(5, 3);
        System.out.println("Sum: " + sum);

        // Call instance method
        MathUtils mathUtils = new MathUtils();
        int product = mathUtils.multiply(5, 3);
        System.out.println("Product: " + product);
    }
}

/*
 * Sum: 8
 * Product: 15
 */