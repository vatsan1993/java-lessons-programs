package ch3;// Adding values from different indexes

import java.util.Arrays;

public class Chap3Ex24 {
    public static void main(String[] args) {

        int[] arr1 = {4,6,3,7,9,5,8,4,8,4,7,4,63,45};
        int[] arr2= new int[5];

        for (int i =1, j= 5,w= 0; i< 6 && j< 10 && w< 5 ; i++, j++, w++){
            arr2[w]= arr1[i]+ arr1[j];
        }
        System.out.println(Arrays.toString(arr2));

    }
}
