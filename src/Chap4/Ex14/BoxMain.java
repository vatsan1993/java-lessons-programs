package Chap4.Ex14;

public class BoxMain {
    public static void main(String[] args) {
        // create object
        Box b1= new Box(1, 15.4, 12.3, 7.3, "cms"); // b1 is the object.
        Box b2= new Box(1, 15.4, 12.3, 7.3, "cms");
        System.out.println(b1.equals(b2));
    }
}
