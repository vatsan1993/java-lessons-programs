package ch1;

import java.util.Scanner;

// Desciption: Use pi and find area and circumference and of circle using input
public class Chap1Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI + Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("The area od the circle is: "+ area);
        System.out.println("The circumference of the circle is: "+ circumference);

    }
}
