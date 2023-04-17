package ch1;
// Example for Scanner

import java.util.Scanner;


public class Chap1Ex20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= sc.nextLine();


        System.out.print("Enter your age: ");
        int age= sc.nextInt();
        System.out.print("Enter your marks: ");
        double marks= sc.nextDouble();

        System.out.println(name+ " is "+ age+ " years old");
        System.out.println(name+ " scored "+ marks+ " marks");

    }
}
