package ch1;

import java.util.Scanner;

// Description: A program to demo nextInt with spaces.
public class Chap1Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 values: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int total = num1 + num2 + num3;
        System.out.println("The sum of three values is: "+ total);
    }
}
