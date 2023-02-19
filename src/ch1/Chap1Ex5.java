package ch1;

// Example for implicit type casting with character and number conversions
public class Chap1Ex5 {
    public static void main(String[] args) {
        String name= "max";  // variable init.
        int age= 20;
        System.out.println(name+ " is "+ age+ " years old");
        //here age is converted to string implicitly.

        byte b= 120;
        int a= b; // b is converted to int implicitly.
        System.out.println(a);

        char ch= 'a';
        int chNum= ch;
        System.out.println(chNum);

    }
}
