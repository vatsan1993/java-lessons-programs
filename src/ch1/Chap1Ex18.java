package ch1;

// type promotion examples
public class Chap1Ex18 {
    public static void main(String[] args) {
        byte b= 20;
        byte b2= 100;
        int c= b*b2;
        System.out.println(c);


        short sh=(short) (b*b2);
        System.out.println(sh);

        int i1= 1500000000;
        int i2=250000000;
        int i3= i1*i2;
        System.out.println(i3);
    }
}
