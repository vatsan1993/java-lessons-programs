package Chap5.Ex2;

import java.util.Arrays;

public class ArrayExpansion {
    static int[] arr;
    static int size;
    public static void main(String[] args) {
        arr= new int[3];
        size= 0;
        insertValue(10);
        insertValue(20);
        insertValue(30);
        insertValue(40);
        System.out.println(Arrays.toString(arr));
    }


    public static void insertValue(int value) {
        if(size== arr.length){
            increaseSize();
        }
        arr[size]= value;
        size++;
    }

    public static void increaseSize(){
        int[] temp= new int[arr.length+1];
        for(int i=0; i< arr.length; i++){
            temp[i]= arr[i];
        }
        arr=temp;
    }


}
