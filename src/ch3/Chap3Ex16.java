package ch3;

public class Chap3Ex16 {
    public static void main(String[] args) {
        int[] arr= {1,3,5,6,3,63};
        int total= 0;
        for(int index=0; index<arr.length; index++){
            total+=arr[index];
        }
        System.out.println("The sum of values in the array is: "+total);

    }
}
