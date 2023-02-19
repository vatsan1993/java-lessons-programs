package Chap4.Ex3;

public class BoxMain {
    public static void main(String[] args) {
        // create object
        Box b1= new Box(); // b1 is the object.
        Box b2= new Box(); // b2 is the object.



        // Accessing public
        System.out.println(b1.id+ " "+ b1.length);
        System.out.println(b2.id+ " "+ b2.length);
        // private variable.
//        System.out.println(b2.width);
//        System.out.println(b2.height);
//        System.out.println(b2.units);
//        System.out.println(b2.width);


        //private variables
        b2.id= 2;
        b2.length= 15.6;
//         cannot do the following as they are private variables
//        b2.width= 10.3;
//        b2.height= 6.3;
//        b2.units= "cms";

    }
}
