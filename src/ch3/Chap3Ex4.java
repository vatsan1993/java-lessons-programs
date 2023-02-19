package ch3;

import java.util.Scanner;
// program to demonstrate if else if ladder
public class Chap3Ex4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num= sc.nextInt();
        if (num>10){
            System.out.println("greater");
        }else if(num<10){
            System.out.println("lesser");
        }else{
            System.out.println("equals");
        }
    }
}
