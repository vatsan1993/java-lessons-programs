package ch3;// finding even numbers from an array

public class Chap3Ex22 {
    public static void main(String[] args) {
        int[] arr1= {3,6,3,4,7,46};

        int count= 0;
        for(int i=0; i< arr1.length; i++){
            if(arr1[i]%2==0){
                count++;
            }
        }
        int[] arr2= new int[count];// count =3   {6, 0, 0}

        for(int i=0, j=0; i< arr1.length && j<arr2.length; i++){  // i=1, j= 1 | 1< 6  and 0< 3
            if(arr1[i]%2==0){  // 6%2==0 F
              arr2[j]= arr1[i];   // arr2[0]= 6
              j++;
            }
        }


    }
}
