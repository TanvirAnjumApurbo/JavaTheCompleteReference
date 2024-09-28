package com.c07;

// Objects are passed through their references.
class Test3 {
    int a, b;

    Test3(int i, int j) {
        a = i;
        b = j;
    }

    void math_(Test3 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class PassObjRef {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.math_(ob);

        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}

/*
 * ob.a and ob.b before call: 15 20
 * ob.a and ob.b after call: 30 10
 */