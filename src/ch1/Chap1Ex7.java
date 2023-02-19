package ch1;

// conversion from strings to int, double.
public class Chap1Ex7 {
    public static void main(String[] args) {
        String strInt= "10";
        int num1= Integer.parseInt(strInt);
        System.out.println(num1);

        String strDouble= "11.3";
        double dbl= Double.parseDouble(strDouble);
        System.out.println(dbl);


        int i= Integer.parseInt(strDouble); // Exception
        System.out.println(i);

    }
}
