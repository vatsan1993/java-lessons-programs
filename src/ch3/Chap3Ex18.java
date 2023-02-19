package ch3;

import java.util.Arrays;

public class Chap3Ex18 {
    public static void main(String[] args) {
//        int[] arr= {2,45,6,4,67,4,47,48,4,7};
        int[] arr= {5,7,10, 1};
        int minVal= arr[0];
        int minIndex= 0;

        int maxVal= arr[0];
        int maxIndex= 0;

        for (int i= 0; i< arr.length; i++){
            if(arr[i]< minVal){
                minVal= arr[i];
                minIndex= i;
            }

            if(arr[i]> maxVal){
                maxVal= arr[i];
                maxIndex= i;
            }
        }

        // Second Largest value

        int secondMaxVal= arr[0];
        if(secondMaxVal== maxVal){
            secondMaxVal= arr[1];
        }

        for (int i=0; i< arr.length;i++){
            if(i!= maxIndex && arr[i]> secondMaxVal){
                secondMaxVal= arr[i];
            }
        }

        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println("Max and min Val: "+maxVal+ " "+ minVal);
        System.out.println("Second largest val: "+secondMaxVal);



        // swap

        int temp = arr[maxIndex];
        arr[maxIndex]= arr[minIndex];
        arr[minIndex]= temp;

        System.out.println("Array after swap: "+Arrays.toString(arr));
        System.out.println("Max and min Val after swap: "+maxVal+ " "+ minVal);
    }
}
