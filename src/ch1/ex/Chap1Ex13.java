package ch1.ex;

public class Chap1Ex13 {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        int c= 30;
        int d= a+b*c; // * happens first
        System.out.println(d);
        int e= (a+b)*c; // a+b happens first
        System.out.println(e);
        int f= a+b-c;
        System.out.println(f);

        //compound operators

    }
}
