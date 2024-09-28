package com.c07;

public class FieldGPT {
    // Instance fields
    String color;
    String model;

    // Static field
    static int numberOfWheels = 4;
    /*
     * numberOfWheels is a static field. It belongs to the Car class itself, not to
     * any particular instance. All Car objects share this field.
     */

    public FieldGPT(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Color: " + color + ", Model: " + model + ", Wheels: " + numberOfWheels);
    }

    public static void main(String[] args) {
        FieldGPT car1 = new FieldGPT("Red", "Toyota");
        FieldGPT car2 = new FieldGPT("Blue", "Honda");

        car1.displayInfo();
        car2.displayInfo();
    }
}

/*
 * Color: Red, Model: Toyota, Wheels: 4
 * Color: Blue, Model: Honda, Wheels: 4
 */