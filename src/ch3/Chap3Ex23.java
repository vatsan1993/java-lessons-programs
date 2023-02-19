package ch3;// Reversing an array
import java.util.Arrays;

public class Chap3Ex23 {
    public static void main(String[] args) {
        int[] arr1= {3,6,3,4,7,46};
        for(int i= 0, j= arr1.length-1; i<j; i++, j--){
            int temp= arr1[i];
            arr1[i]= arr1[j];
            arr1[j]= temp;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
