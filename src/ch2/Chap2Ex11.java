package ch2;

import java.awt.event.ActionListener;
import java.util.Arrays;

// String methods
public class Chap2Ex11 {
    public static void main(String[] args) {
        String s= "Hello";
        char ch= s.charAt(3);
        System.out.println(ch);

        String s1= "Hi";
        String s2= "hi";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));

        String greetings= s1.concat(" Max"); // gives a new string. does not edit s1.
        System.out.println(greetings);


        String str = "How are you?" ;
        System.out.println(str.contains("re "));


        System.out.println(str.startsWith("Ho"));
        System.out.println(str.endsWith("you?"));

        System.out.println(str.indexOf("are"));
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf('o', 3));

        System.out.println(str.lastIndexOf("o"));

        String emptyString= "";
        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString.length());

        String pass= "H@iajhdfljas";
        System.out.println(pass.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$"));

        // temporary operation.
        String s3= "How 1 are you? 54";
        System.out.println(s3.replace("o", "hi"));

        System.out.println(s3.replaceAll("^[\\d]$","100" ));


        String[] arr=s3.split(" ");
        System.out.println(Arrays.toString(arr));

        System.out.println(s3.substring(5));
        System.out.println(s3.substring(5, 12));

        System.out.println(Arrays.toString(s3.toCharArray()));

        String s4= "      how are you      ";
        System.out.println(s4.trim());


        System.out.println(String.valueOf('c'));

    }
}
