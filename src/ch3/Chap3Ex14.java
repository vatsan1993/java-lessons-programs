package ch3;// Program for do while loop
import java.util.Scanner;

public class Chap3Ex14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int total= 0;
        int a;
        do{
            System.out.println("Enter a number");
            a= sc.nextInt();
            total+=a;
        }while(a>=0);
        System.out.println(total);
    }
}
