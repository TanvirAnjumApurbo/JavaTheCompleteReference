package com.c06;

class Box5 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 myBox1 = new Box5();
        Box5 myBox2 = new Box5();

        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        System.out.println("Volume is " + myBox1.volume());
        System.out.println("Volume is " + myBox2.volume());
    }
}

/*
 * Volume is 3000.0
 * Volume is 162.0
 */