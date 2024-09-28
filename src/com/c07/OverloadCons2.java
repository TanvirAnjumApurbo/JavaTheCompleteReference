package com.c07;

// Here, Box allows one object to initialize another.
class Box2 {
    double width;
    double height;
    double depth;

    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        Box2 myBox1 = new Box2(10, 20, 15);
        Box2 myBox2 = new Box2();
        Box2 myCube = new Box2(7);

        Box2 myClone = new Box2(myBox1);

        System.out.println("Volume of myBox1 is " + myBox1.volume());

        System.out.println("Volume of myBox2 is " + myBox2.volume());

        System.out.println("Volume of cube is " + myCube.volume());

        System.out.println("Volume of clone is " + myClone.volume());
    }
}

/*
 * Volume of myBox1 is 3000.0
 * Volume of myBox2 is -1.0
 * Volume of cube is 343.0
 * Volume of clone is 3000.0
 */