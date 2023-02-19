package ch1.ex;

// Examples for bitwise op
public class Chap1Ex15 {
    public static void main(String[] args) {
        int a= 8;
        int b= 10;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a^b);
        System.out.println(a>>1);
        System.out.println(a<<1);
        a= -5;
        System.out.println(a>>1);
        System.out.println(a<<1);
        System.out.println(a>>>1);
    }
}
