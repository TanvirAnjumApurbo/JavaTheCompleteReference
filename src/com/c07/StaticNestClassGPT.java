package com.c07;

class OuterClass {
    // Static nested class
    static class NestedClass {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}

public class StaticNestClassGPT {
    public static void main(String[] args) {
        // Create an instance of the static nested class
        OuterClass.NestedClass nested = new OuterClass.NestedClass();
        nested.display();
    }
}

/*
 * Inside static nested class
 */
