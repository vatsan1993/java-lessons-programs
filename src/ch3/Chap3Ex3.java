package ch3;// Program to demonstrate if else block.
import java.util.Scanner;

public class Chap3Ex3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= sc.nextInt();
        if (age>=18){
            System.out.println("You are eligible for voting.");
        } else{
            System.out.println("You are not eligible for voting.");
        }

    }
}
