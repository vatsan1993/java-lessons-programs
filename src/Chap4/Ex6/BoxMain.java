package Chap4.Ex6;

public class BoxMain {
    public static void main(String[] args) {
        // create object
        Box b1= new Box(); // b1 is the object.
        Box b2= new Box(); // b2 is the object.

        b1.display();

        b2.display();
        double vol= b1.calcVolume(0.05);
        System.out.println(vol);
        System.out.println(b2.calcVolume(0.1));




    }
}
