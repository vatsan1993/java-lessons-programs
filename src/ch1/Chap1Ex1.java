package ch1;
// Author: S. Srivatsan
// Version: 1.0
// Program to demonstrate how to create variables of different datatypes and printlns.
public class Chap1Ex1 {
    public static void main(String[] args) {
        String name= "max";  // variable init.
        int age= 20;
        byte age2= 20;
        short age3= 20;
        long age4= 20;
        float marks= 99.9f;
        double marks2= 99.9;
        char firstLetter= 'm';
        boolean isFootballPlayer= true;


        System.out.println("Hello World");
        System.out.println(10); // java automatically treats this as int
        System.out.println(78.3);// java automatically treats this as double
        System.out.println(name);
        System.out.println(age);
        System.out.print(age2);
        System.out.print(age3);
        System.out.print(age4);

        System.out.println(marks);
        System.out.println(marks2);
        System.out.println(firstLetter);
        System.out.println(isFootballPlayer);




    }
}
