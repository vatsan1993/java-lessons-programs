package ch3;

import java.util.Arrays;
import java.util.Scanner;

public class Chap3Ex45 {
    public static void main(String[] args) {
        // easy way without expansion
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter number values in the array: ");
//        int count= sc.nextInt();
//        int[] arr= new int[count];
//        for (int i=0;i< arr.length; i++){
//            System.out.println("Enter a number: ");
//            arr[i]= sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));


        // hard way with expansion
        // adding new values to the array
//        final int CAPACITY= 3;
//        int numValues=0;
//        int[] arr2= new int[CAPACITY];
//        // input taken only at the start.
//        System.out.println("Enter a number or stop: ");
//        String input= sc.next();
//        while(!input.equals("stop")){
//
//            int num= Integer.parseInt(input);
//            if(numValues< CAPACITY){
//                arr2[numValues]= num;
//                numValues++;
//            }else{
//                // expanding the array.
//                int[] temp= new int[arr2.length+1];
//                for (int i=0; i<arr2.length; i++){
//                    temp[i]= arr2[i];
//                }
//                temp[temp.length-1]= num;
//                arr2= temp;
//            }
//            // repeating input
//            System.out.println("Enter a number or stop: ");
//            input= sc.next();
//
//        }
//        System.out.println(Arrays.toString(arr2));

        // adding a value at a specific index.
        int[] arr2= {3,56,3,6,463,6,41};
        System.out.println("Enter the index at which you want to place the value: ");
        int index= sc.nextInt();
        System.out.println("Enter the new value: ");
        int val= sc.nextInt();
        if(index<= arr2.length){
            int[] temp= new int[arr2.length+1];
            for(int i= 0; i< index; i++){
                temp[i]= arr2[i];
            }
            temp[index]=val;
            for(int i= index; i< arr2.length; i++){
                temp[i+1]= arr2[i];
            }
            arr2= temp;
        }
        System.out.println(Arrays.toString(arr2));


        //removing a value from the array.
        System.out.println();
        System.out.println("Enter the index for the value you want to remove: ");
        int removeIndex= sc.nextInt();
        if(removeIndex<= arr2.length){
            int[] temp= new int[arr2.length-1];
            for(int i= 0; i< removeIndex; i++){
                temp[i]= arr2[i];
            }

            for(int i= removeIndex+1; i< arr2.length; i++){
                temp[i-1]= arr2[i];
            }
            arr2= temp;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
