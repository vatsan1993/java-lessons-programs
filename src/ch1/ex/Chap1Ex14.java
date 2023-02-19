package ch1.ex;

// Ternary Examples
public class Chap1Ex14 {
    public static void main(String[] args) {
        int a= 10;
        int b= a>0? a: -1;  // b = 10
        a= -5;
        b= a>0? a: -1; // b= -1
        a= 10;
        int c= a>0? b>0?a:b :50;
        System.out.println(c);



    }
}
