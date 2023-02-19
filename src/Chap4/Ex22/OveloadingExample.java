package Chap4.Ex22;

public class OveloadingExample {
    public static double add(double a, double b){
        return a+ b;
    }
    public static int add(char a, int b){
        return a+b;
    }
    public static String add(String a, String b){
        return a+" "+b;
    }
    public static double add(double a, double b, double c){
        return a+ b+c;
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add('a', 10));
        System.out.println(add("hi", "bye"));
        System.out.println(add(1, 20, 30));
    }
}
