package ch1.ex;

import java.util.Scanner;

// Examples of a math class  methods and functions
public class Chap1Ex11 {
    public static void main(String[] args) {
        System.out.println(Math.E);
        double radius= 10.2;
        System.out.println("The area of the circle is: "+ (Math.PI * Math.pow(radius, 2)));
        double d1= 10.6;
        System.out.println(Math.ceil(d1)); //11
        System.out.println(Math.floor(d1)); //10
        System.out.println(Math.round(d1)); //11
        System.out.println(Math.random()) ; //random value between 0.0 to 1.0
        int max= 20;
        int min= 10;
        System.out.println(Math.random() * (max - min + 1) + min  ); // double random between 10 and 20
        System.out.println(Math.round(Math.random() * (max - min + 1) + min)  ); // int random between 10 and 20


        System.out.println(Math.max(10, 20));
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= sc.nextInt();
        System.out.println("Enter a number:");
        int b=  sc.nextInt();
        System.out.println(Math.max(a, b));
        System.out.println(Math.sqrt(25)); // 5

        double res= Math.sqrt(25);

    }
}
