package com.c07;

/* Now, both stack and tos are private. This means that they cannot be accidentally or maliciously altered in a way that would be harmful to the stack. */
class Stack1 {
    private int stack[] = new int[10];
    private int tos;

    Stack1() {
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

public class TestStack1 {
    public static void main(String[] args) {
        Stack1 myStack1 = new Stack1();
        Stack1 myStack2 = new Stack1();

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

        // These statements are not legal
        // myStack1.tos = -2;
        // myStack2.stack[3] = 100;
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