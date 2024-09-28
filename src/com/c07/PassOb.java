package com.c07;

// Objects may be passed to methods.
class Test1 {
    int a, b;

    Test1(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test1 o) {
        if (o.a == a && o.b == b)
            return true;
        else
            return false;
    }
}

public class PassOb {
    public static void main(String[] args) {
        Test1 ob1 = new Test1(100, 22);
        Test1 ob2 = new Test1(100, 22);
        Test1 ob3 = new Test1(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}

/*
 * ob1 == ob2: true
 * ob1 == ob3: false
 */