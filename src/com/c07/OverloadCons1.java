package com.c07;

class Box1 {
    double width;
    double height;
    double depth;

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons1 {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1(10, 20, 15);
        Box1 myBox2 = new Box1();
        Box1 myCube = new Box1(7);

        System.out.println("Volume of myBox1 is " + myBox1.volume());
        System.out.println("Volume of myBox2 is " + myBox2.volume());
        System.out.println("Volume of myCube is " + myCube.volume());
    }
}

/*
 * Volume of myBox1 is 3000.0
 * Volume of myBox2 is -1.0
 * Volume of myCube is 343.0
 */
