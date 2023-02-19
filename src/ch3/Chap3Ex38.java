package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chap3Ex38 {

    public static void main(String[] args) throws IOException {
        String punct=  "!()-[]{};:'\"\\,<>./?@#$%^&*_~";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a message: ");

        String message= br.readLine();
        String[] words= message.split(" ");
        for(int j= 0; j< words.length; j++){
            String word= words[j];
            for (int i=0; i< word.length(); ){
                String currentChar= ""+word.charAt(i);
                if(punct.contains(currentChar)){
                    words[i]=word.replace( currentChar, "");
                    word = words[i];
                }
                else{
                    i++;
                }
            }
        }

        System.out.println(Arrays.toString(words));
    }
}
