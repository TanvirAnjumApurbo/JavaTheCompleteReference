package com.c06;

class Box1 {
    double width;
    double height;
    double depth;
}

public class BoxDemo1 {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        vol = myBox1.width * myBox1.height * myBox1.depth;

        System.out.println("Volume is " + vol);
    }
}

/*
 * Volume is 3000.0
 */
