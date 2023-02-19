package ch2;

import java.util.Arrays;

// 2d arrays mem alloc
public class Chap2Ex7 {
    public static void main(String[] args) {
        int[][] arr= new int[2][3];
        arr[0][0]= 1;
        arr[0][1]= 2;
        arr[0][2]= 3;
        arr[1][0]= 4;
        arr[1][1]= 5;
        arr[1][2]= 6;
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));

    }
}
