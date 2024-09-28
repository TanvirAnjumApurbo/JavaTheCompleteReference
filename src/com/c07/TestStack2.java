package com.c07;

class Stack2 {
    private int[] stack;
    private int tos;

    Stack2(int size) {
        stack = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stack.length - 1)
            System.out.println("Stack is full.");
        else
            stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stack[tos--];
    }
}

public class TestStack2 {
    public static void main(String[] args) {
        Stack2 myStack1 = new Stack2(5);
        Stack2 myStack2 = new Stack2(8);

        for (int i = 0; i < 5; i++)
            myStack1.push(i);

        for (int i = 0; i < 8; i++)
            myStack2.push(i);

        System.out.println("Stack in myStack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());

        System.out.println("Stack in myStack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());
    }
}
/*
 * Stack in myStack1:
 * 4
 * 3
 * 2
 * 1
 * 0
 * Stack in myStack2:
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 * 0
 */