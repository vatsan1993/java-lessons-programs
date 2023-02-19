package ch3;

import java.util.Scanner;

public class Chap3Ex13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;  // To hold number of terms
        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();
        double sum = 0;
        int sign = 1;
        int i = 1;
        while( i <= number)
        {
            sum += (1.0 * sign) / i;
            sign *= -1;
            i++;
        }

        System.out.println("log2: " + sum);
    }
}
