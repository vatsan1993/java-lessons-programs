package ch3;

import java.util.Arrays;

// copying largest consecutive values into another array.
public class Chap3Ex44 {

    public static void main(String[] args) {
        int[] arr= {3,4,5, 7,8,9,10, 5,6};
        int maxCount= 1;
        int startIndex= 0;
        int endIndex= 0;
        for(int i=0 ; i< arr.length; i++){
            int count= 1;
            for(int j= i; j< arr.length-1; j++){
                if(arr[j]+1== arr[j+1]){
                    count++;
                    if(count>maxCount){
                        maxCount= count;
                        startIndex= i;
                        endIndex= j+1;
                    }

                }
                else{
                    count=1;
                    i= j;
                    break;
                }
            }
        }
        System.out.println(maxCount);

        int [] arr2= new int[maxCount];
        for(int i= startIndex, j= 0; i<= endIndex; i++, j++){
            arr2[j]= arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
