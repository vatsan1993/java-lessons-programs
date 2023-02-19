package ch2;

import java.util.Arrays;

public class Chap2Ex8 {
    public static void main(String[] args) {
        int[][] arr= new int[3][];
        arr[0]= new int[1]; // row 1  - 1 columns
        arr[1]= new int[2]; // row 2- 2 columns
        arr[2]= new int[3]; // row 3 - 3 columns

        arr[0][0]= 1;
        arr[1][0]= 2;
        arr[1][1]= 3;
        arr[2][0]= 4;
        arr[2][1]= 5;
        arr[2][2]= 6;
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

    }
}
