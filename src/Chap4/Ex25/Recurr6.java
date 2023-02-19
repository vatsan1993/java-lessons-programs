package Chap4.Ex25;

public class Recurr6 {
    public static void main(String[] args) {
        System.out.println(isPower(25));
        System.out.println(isPower(8));
        System.out.println(isPower(-2));
        boolean n= isPower(-8);
        System.out.println(n);
        System.out.println(isPower(-9));
    }

    private static boolean  isPower(int n){
        if(n==2 || n==-2){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        return isPower(n/2);
    }
}
