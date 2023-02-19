package ch2;//2d arrays

import java.util.Arrays;

public class Chap2Ex6 {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr[0]));

        System.out.println(arr[0][0]);

        // changing value in the 2d array
        arr[0][0]= 100;
        System.out.println(Arrays.toString(arr[0]));

    }
}
