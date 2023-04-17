package ch2;

import java.util.Arrays;

public class ArrayDistinct {
    public static void main(String[] args) {
        int[] arr= {2,45,23,54,23,2,2,4,5,2,4,3,4,2,2};
        int sum=0;
        for(int i=0; i< arr.length; i++){
            int currentValue= arr[i];
            int count= 0;
            for(int j=0; j< arr.length; j++){
                if(arr[i]== arr[j]){
                    count++;
                }
            }

            if(count==1){
                sum+= currentValue;
                System.out.println(currentValue);
            }

        }
        System.out.println(sum);
    }
}
