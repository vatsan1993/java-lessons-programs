package ch1;
// Description: A program that shows assignment operators
public class Chap1Ex12 {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;

        // permanent
        a+=b; // increasing a value by b value
        System.out.println(a);
        a+=10;
        System.out.println(a);
        a*=5;
        System.out.println(a);
        a-=1;
        System.out.println(a);
        a/=2; // both a and 2 are int so we get 99
        System.out.println(a);
        a%=2;
        System.out.println(a);
    }
}
