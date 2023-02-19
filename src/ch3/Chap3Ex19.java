package ch3;

import java.util.Arrays;

public class Chap3Ex19 {
    public static void main(String[] args) {
        int[] arr1= {3,5,367,4};
        int[] arr2={5,6,7,3};
        int[] arr3= new int[arr1.length];

        for(int i= 0; i< arr3.length; i++){
            arr3[i]= arr1[i]+ arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

    }
}
