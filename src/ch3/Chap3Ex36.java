package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap3Ex36 {
    public static void main(String[] args) throws IOException {
        String punct=  "!()-[]{};:'\"\\,<>./?@#$%^&*_~";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a message: ");

        StringBuffer message= new StringBuffer(br.readLine());

        for (int i=0; i< message.length(); ){
           char currentChar= message.charAt(i);
           if(punct.contains(""+currentChar)){
               message.replace(i,i+1, "");  // i, i+1 means we want to remove 1 character starting from ith position
               // here i++ should be written as there a character removes and the rest of the characters shifts left.
               // i should not move to the next character as it will skip a char in between.
               // This is why we dont use i++ in the for loop directly
           }
           else{
               i++;
           }

        }
        System.out.println(message.toString());

    }
}

