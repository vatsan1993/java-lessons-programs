// Author: S. Srivatsan
// Version: 1.0
// Description: A program that shows implicit and explicit type casting
package ch1;

public class Chap1Ex4 {
    public static void main(String[] args) {
        // implicit type casting
        byte b= 10;
        short sh= b;
        int i= b;
        float f= i;
        double d= f;

        // Explicit type casting
        int i2= 10;
        short sh2= (short) i2;
        byte b2= (byte) i2;


        // lossy conversion
        int i3= 128;
        byte b3= (byte) i3;
        System.out.println(b3); // -127
        int i4= 130;
        byte b4= (byte) i4;
        System.out.println(b4);

        int i5= 256;
        byte b5= (byte) i5;
        System.out.println(b5);


        int i6= 383;
        byte b6= (byte) i6;
        System.out.println(b6);

        int i7= 1000;
        byte b7= (byte) i7;
        System.out.println(i7);


        double d2= 123.56;
        int i8= (int) d2;
        System.out.println(i8);

    }
}
