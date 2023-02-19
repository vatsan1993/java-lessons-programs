package ch3;

import java.util.Scanner;

public class Chap3Ex1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= sc.nextInt();
        if (a>=0)
            System.out.println(a+ " is +ve");
        System.out.println("End of program");
    }
}
