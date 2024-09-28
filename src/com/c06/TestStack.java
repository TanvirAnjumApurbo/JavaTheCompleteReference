package com.c06;

class Stack {
    int[] stack = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
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

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        for (int i = 0; i < 10; i++)
            myStack1.push(i);

        for (int i = 10; i < 20; i++)
            myStack2.push(i);

        System.out.println("Stack in myStack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack1.pop());

        System.out.println("Stack in myStack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack2.pop());
    }
}

/*
 * Stack in myStack1:
 * 9
 * 8
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 * 0
 * Stack in myStack2:
 * 19
 * 18
 * 17
 * 16
 * 15
 * 14
 * 13
 * 12
 * 11
 * 10
 */
