package ch1;
// More examples for explicit typecasting.

public class Chap1Ex6 {
    public static void main(String[] args) {
        double db= 143.2;
        int value=(int) db;
        System.out.println(value);

        float ft= 140.0f;
        int value2= (int) ft;
        System.out.println(value2);

        int value3= 128;
        byte bt1= (byte) value3;
        System.out.println(bt1);

        int value4= 270;
        byte bt2= (byte) value4;
        System.out.println(bt2);

        int chrNum= 102;
        char ch=(char) chrNum;
        System.out.println(ch);


        // implicit
        char ch2= 'a';
        int i= ch2;
        System.out.println(i);

        // explicit
        int i2= 100;
        char ch3= (char) i2;
        System.out.println(ch3);


        // character increment
        char ch4= 'b';
        int i3= ch4+ 1; // implicit type casting
        char ch5= (char) i3;
        System.out.println(ch5);
    }
}
