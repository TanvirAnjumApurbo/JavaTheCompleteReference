package com.c06;

class Box9 {
    double width;
    double height;
    double depth;

    Box9(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo9 {
    public static void main(String[] args) {
        Box9 myBox1 = new Box9(10, 20, 15);
        Box9 myBox2 = new Box9(3, 6, 9);

        System.out.println("Volume is " + myBox1.volume());
        System.out.println("Volume is " + myBox2.volume());
    }
}

/*
 * Volume is 3000.0
 * Volume is 162.0
 */