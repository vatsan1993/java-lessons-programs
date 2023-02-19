package ch3;

import java.util.Arrays;

public class Chap3Ex20 {
    public static void main(String[] args) {
        int[] arr1= {1,43,5};
        int[] arr2= {3,6,3,4,7,46};

        int minLength; // 3
        int maxLength; // 6
        if (arr1.length> arr2.length){
            minLength= arr2.length;
            maxLength= arr1.length;
        }
        else {
            minLength= arr1.length;
            maxLength= arr2.length;
        }
        int[] arr3= new int[maxLength];  // arr3= [4,49,8,4,7,46];
        for (int i= 0; i< minLength; i++){   // i =3  // 3< 3
            arr3[i]= arr1[i]+ arr2[i];
        }

        // taking remaining values and putting them into the arr3.
        if(arr1.length> arr2.length){
            for(int i= minLength; i< maxLength; i++){
                arr3[i]= arr1[i];
            }
        }

        if(arr2.length> arr1.length){  // 6>3 True
            for(int i= minLength; i< maxLength; i++){   // i =3
                arr3[i]= arr2[i];
            }
        }


        System.out.println(Arrays.toString(arr3));
    }
}
