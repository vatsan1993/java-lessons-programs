package ch3;

// Enhanced for loop.
public class Chap3Ex47 {
    public static void main(String[] args) {
        int[] arr= {2,5,4,673};
        int total= 0;
        for(int val: arr){
            total+= val;
        }
        System.out.println(total);

    }
}
