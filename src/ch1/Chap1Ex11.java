package ch1;
// Description: A program that shows problems with arithmetic operators
public class Chap1Ex11 {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        System.out.println(a+b); // 30 // temporary
        System.out.println(a-b); // -10
        System.out.println(a*b); // 200
        System.out.println(a/b); // 0
        // to get double value we need conversion
        System.out.println((double) a/b);


        int x= 10;
        int y= 20;
        x= x+y; // permanent
        System.out.println(x);


        // Unary operators (++, --)

        //Pre inc/dec
        System.out.println("A value before: "+ a);
        int c= ++a+b; // ++ happens first then the other operation. // permanent
        System.out.println("A value after: "+ a);
        System.out.println("C value :"+ c);

        //Post inc/dec
        System.out.println("A value before: "+ a); // a is 11 from the previous increment.
        int d= a+++b; // ++ happens later // permanent
        System.out.println("A value after: "+ a);
        System.out.println("d value :"+ d);

    }
}
