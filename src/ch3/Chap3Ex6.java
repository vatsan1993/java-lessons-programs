package ch3;

import java.util.Scanner;

public class Chap3Ex6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= sc.nextInt();
        if (age> 120){
            System.out.println("Too old for voting");
        } else{
            if (age>=18){
                System.out.println("You are eligible for voting.");
            } else{
                System.out.println("You are not eligible for voting.");
            }
        }
        
        
        
        // Method 2
        if (age> 120){
            System.out.println("Too old for voting");
        } else if (age>=18){
            System.out.println("You are eligible for voting.");
        } else{
            System.out.println("You are not eligible for voting.");
        }


    }
}
