package Chap4.Ex24;

public class BoxMain {
    public static void main(String[] args) {
        // create object
        Box b1= new Box(15.4, 12.3, 7.3);
        Box b2= Box.fromInches(5.2, 3.9, 1.1);
        Box b3= new Box();
        Box b4= new Box(5, 3);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(Box.getNumBoxes());
    }
}
