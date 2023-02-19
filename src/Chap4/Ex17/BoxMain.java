package Chap4.Ex17;

public class BoxMain {
    public static void main(String[] args) {
        // create object
        Box b1= new Box(15.4, 12.3, 7.3, "cms"); // b1 is the object.
        Box b2= new Box( 15.4, 12.3, 7.3, "cms");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(Box.getNumBoxes());
    }
}
