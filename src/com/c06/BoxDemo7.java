package com.c06;

class Box7 {
    double width;
    double height;
    double depth;

    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 myBox1 = new Box7(10, 20, 15);
        Box7 myBox2 = new Box7(3, 6, 9);

        System.out.println("Volume is " + myBox1.volume());
        System.out.println("Volume is " + myBox2.volume());
    }
}

/*
 * Volume is 3000.0
 * Volume is 162.0
 */