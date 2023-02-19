package Chap5.Ex4;

public class Main {
    public static void main(String[] args) {
        Rectangle r= new Rectangle(10,8);
        System.out.println(r.calculateArea());
        System.out.println(r);

        Square s1= new Square(10);
        double area= s1.calculateArea();
        System.out.println(area);
        String output= s1.toString();
        System.out.println(output);
    }
}
