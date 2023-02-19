package Chap4.Ex25;

import java.util.Arrays;

public class Recurr5 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2= {1,2,3,2,1};
        System.out.println(isPalindrome(arr2));
        int[] arr3= {1,2,3,3,2,1};
        System.out.println(isPalindrome(arr3));

    }
    public static void reverseArr(int[] arr){
        reverseArr(arr, 0, arr.length-1);
    }

    public static void reverseArr(int[] arr, int start, int end){
        if(start>end){
            return;
        }
        int temp= arr[start];
        arr[start]= arr[end];
        arr[end]= temp;
        start++;
        end--;
        reverseArr(arr, start, end);
    }


    public static boolean isPalindrome(int[] arr){
        return isPalindrome(arr, 0, arr.length-1);
    }

    public static boolean isPalindrome(int[] arr, int start, int end){
        if(start>end){
            return true;
        }
        if(arr[start]!= arr[end]){
            return false;
        }
        start++;
        end--;
        return isPalindrome(arr, start, end);
    }


}
