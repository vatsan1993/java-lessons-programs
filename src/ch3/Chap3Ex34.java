package ch3;// Vowels Program 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap3Ex34 {
    public static void main(String[] args) throws IOException {
        String vowels= "aeiou";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a message: ");

        String message= br.readLine();

        // Method 1 # With nested loops and break  # slower

        for(int i=0; i< vowels.length(); i++){
            for(int j=0; j< message.length();j++){
                if(message.charAt(j)==vowels.charAt(i)){
                    System.out.println(vowels.charAt(i));
                    break; // break if you are just checking if a vowels exists.
                }
            }
        }



        System.out.println();
        // Method 2 With a normal loop and contains
        for(int i=0; i< vowels.length(); i++){
            if(message.contains(""+vowels.charAt(i))){
                System.out.println(vowels.charAt(i));
            }
        }

        System.out.println();

        //  Getting all vowels
        for(int i=0; i< message.length(); i++){
            for(int j=0 ; j< vowels.length(); j++){
                if(message.charAt(i)==vowels.charAt(j)){
                    System.out.println(vowels.charAt(j));

                }
            }
        }


    }
}
