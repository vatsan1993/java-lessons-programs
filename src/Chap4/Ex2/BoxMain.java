package Chap4.Ex2;

import Chap4.Ex1.Box;

public class BoxMain {
    public static void main(String[] args) {
        // create object
        Chap4.Ex2.Box b1= new Chap4.Ex2.Box(); // b1 is the object.
        Chap4.Ex2.Box b2= new Chap4.Ex2.Box(); // b2 is the object.



        // Accessing values from the objects
        System.out.println("Box1 Details: ");
        System.out.println(b1.id);
        System.out.println(b1.length+ " "+b1.units);
        System.out.println(b1.width+ " "+b1.units);
        System.out.println(b1.height+ " "+b1.units);
        System.out.println();
        System.out.println("Box2 Details: ");
        System.out.println(b2.id);
        System.out.println(b2.length+ " "+b2.units);
        System.out.println(b2.width+ " "+b2.units);
        System.out.println(b2.height+ " "+b2.units);

        System.out.println();
        b2.id= 2;
        b2.length= 15.6;
        b2.width= 10.4;
        b2.height= 8.3;
        b2.units= "cms";
        System.out.println("Box2 Details: ");
        System.out.println(b2.id);
        System.out.println(b2.length+ " "+b2.units);
        System.out.println(b2.width+ " "+b2.units);
        System.out.println(b2.height+ " "+b2.units);

    }
}
