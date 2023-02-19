package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHap3Ex28 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int total= 0;
        System.out.println("Enter a number. Type stop to end the program");
        String word= br.readLine();
        while(!word.equals("stop") ){
            total+= Integer.parseInt(word);
            System.out.println("Enter a number. Type stop to end the program");
             word= br.readLine();
        }
        System.out.println(total);
    }
}
