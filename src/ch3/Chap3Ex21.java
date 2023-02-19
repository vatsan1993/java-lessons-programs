package ch3;// joining two arrays

import java.util.Arrays;

public class Chap3Ex21 {
    public static void main(String[] args) {
        int[] arr1= {1,43,5};
        int[] arr2= {3,6,3,4,7,46};


        int[] arr3= new int[arr1.length+ arr2.length]; // {1,43,5,3,6,3,4,7,46}

        for(int i= 0; i< arr1.length; i++){
            arr3[i]= arr1[i];
        }
        for(int j= 0, i=arr1.length; j< arr2.length; j++,i++){
            arr3[i]= arr2[j];
        }
        System.out.println(Arrays.toString(arr3));

    }
}
