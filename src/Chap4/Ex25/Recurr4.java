package Chap4.Ex25;

import java.util.Scanner;

public class Recurr4 {
    public static void main(String[] args) {
        fibonacci(45, 20);
    }
    public static void fibonacci(int threshold, int n){
//        int a= 0;
//        int b= 1;
//        System.out.println(a+ "\n"+ b);
//        fibonacci(a, b, threshold);
//
//        System.out.println();
//        System.out.println(a+ "\n"+ b);
//        fibonacci(a, b, 2,n);
//
//        fibonacci();

        System.out.println(fib(6));
    }

    public static int fib(int n){
        int a= 0;
        int b= 1;
        if (n ==1){
            return a;
        }

        return fibonacci( a,  b,  2, n);
    }

    public  static int fibonacci(int a, int b, int i,int n){
        int c= a+b;
        a= b;
        b= c;
        if (i>= n){
            return b;
        }
        i++;
        return fibonacci(a, b,i, n);
    }


    public static void fibonacci(){
        Scanner sc= new Scanner(System.in);
        int a= 0;
        int b= 1;
        System.out.println("Enter the number of value: ");
        int n= sc.nextInt();
        System.out.println(a+ "\n"+ b);
        int count= 2;

        while (count<=n){
            int c= a+b;
            a= b;
            b= c;
            System.out.println(b);
            count++;
        }

    }
    public static void fibonacci(int a,int b, int threshold){

        int c= a+b;
        a= b;
        b= c;
        if(b>threshold){
            return;
        }
        System.out.println(b);
        fibonacci(a, b, threshold);
    }
//    public static void fibonacci(int a, int b , int i,int n){
//        int c= a+b;
//        a= b;
//        b= c;
//        if (i>= n){
//            return;
//        }
//        System.out.println(b);
//        i++;
//        fibonacci(a, b,i, n);
//    }
}
