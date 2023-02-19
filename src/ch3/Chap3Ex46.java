package ch3;

import java.util.Arrays;
// Matrix Multiplication
public class Chap3Ex46 {
    public static void main(String[] args) {
        int [][] arr1= {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][] arr2= {{9,8,7}, {6,5,4}, {3,2,1}};
        if(arr1[0].length == arr2.length){
            int[][] arr3= new int[arr1.length][arr2[0].length];
            for(int i=0; i< arr3.length; i++){
                for(int j=0; j< arr3[0].length; j++ ){
                    for(int k= 0; k< arr1[0].length; k++ ){
                        arr3[i][j]+= arr1[i][k] * arr2[k][j];
                    }
                }
            }

            for(int i=0;i< arr3.length;i++){
                System.out.println(Arrays.toString(arr3[i]));
            }
        }
        else{
            System.out.println("Cannot multiply");
        }

    }
}
