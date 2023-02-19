package ch2;

import java.util.Arrays;
import java.util.Scanner;

public class Chap2Ex5 {
    public static void main(String[] args) {
        int[] arr1= new int[5];
        System.out.println(Arrays.toString(arr1));
        double[] arr2= new double[5];
        System.out.println(Arrays.toString(arr2));
        String[] arr3= new String[5];
        System.out.println(Arrays.toString(arr3));

        arr1[0] = 100;
        arr1[1]= 20;
        arr1[2]= 40;
        arr1[3]= 95;
        arr1[4]= 67;
        System.out.println(Arrays.toString(arr1));

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the index: ");
        int index= scanner.nextInt();
        System.out.println("Enter a value: ");
        double value= scanner.nextDouble();
        arr2[index]= value;
        System.out.println(Arrays.toString(arr2));

    }
}
