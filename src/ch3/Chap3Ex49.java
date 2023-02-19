package ch3;

public class Chap3Ex49 {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3}, {4,5,6}, {7,8,9}};
        int total= 0;
        for(int[] internalArr: arr){
            for(int val: internalArr){
                total+=val;
            }
        }
        System.out.println(total);

    }
}
