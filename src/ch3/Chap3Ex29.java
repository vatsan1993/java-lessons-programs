package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap3Ex29 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int total= 0;
        System.out.println("Enter a number. Type stop to end the program");
        String word= br.readLine();
        while(!word.equals("stop")){
            total+= Integer.parseInt(word);
            if(total> 200){ break;}
            System.out.println("Enter a number. Type stop to end the program");
            word= br.readLine();
        }
        System.out.println(total);


    }
}
