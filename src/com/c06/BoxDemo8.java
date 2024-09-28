package com.c06;

class Box8 {
    double width;
    double height;
    double depth;

    Box8(double w, double h, double d) {
        this.width = w; // Redundant use of 'this'
        this.height = h; // Redundant use of 'this'
        this.depth = d; // Redundant use of 'this'
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo8 {
    public static void main(String[] args) {
        Box8 myBox1 = new Box8(10, 20, 15);
        Box8 myBox2 = new Box8(3, 6, 9);

        System.out.println("Volume is " + myBox1.volume());
        System.out.println("Volume is " + myBox2.volume());
    }
}

/*
 * Volume is 3000.0
 * Volume is 162.0
 */