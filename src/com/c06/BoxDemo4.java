package com.c06;

class Box4 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 myBox1 = new Box4();
        Box4 myBox2 = new Box4();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        System.out.println("Volume is " + myBox1.volume());
        System.out.println("Volume is " + myBox2.volume());
    }
}

/*
 * Volume is 3000.0
 * Volume is 162.0
 */