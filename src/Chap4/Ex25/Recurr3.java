package Chap4.Ex25;

public class Recurr3 {
    public static void main(String[] args) {
        int[] arr= {2,5,634,74,4};
        System.out.println(average(arr));
    }
    public static double average(int[] arr){
        return average(arr, 0, 0);
    }

    private static double average(int[] arr,int i,int total){
        if(i>=arr.length){
            return ((double)total/arr.length);
        }
        total+=arr[i++];
        return average(arr, i, total);
    }

}
