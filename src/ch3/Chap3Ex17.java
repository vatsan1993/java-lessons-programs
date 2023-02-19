package ch3;

import java.util.Arrays;

public class Chap3Ex17 {
    public static void main(String[] args) {
        int[] arr= {1,3,5,6,3,63, 7, 5};
        int[] squares= new int[arr.length];
        for(int i =0; i< arr.length; i++){
            squares[i]= (int)Math.pow(arr[i], 2);
        }
        System.out.println(Arrays.toString(squares));

    }
}

