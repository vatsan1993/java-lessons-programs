package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

// substitution cypher
public class Chap3Ex40 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your message: ");

        String message=br.readLine();
        Random random= new Random();
        // generating key
        StringBuffer alphabets= new StringBuffer(" abcdefghijklmnopqrstuvwxyz");
        StringBuffer key= new StringBuffer("");
        StringBuffer encryptedString= new StringBuffer("");
        System.out.println(alphabets.toString());
        for(int i= 0; i< 27; i++){
            int randInt= random.nextInt(alphabets.length());
            key.append(alphabets.charAt(randInt));
            alphabets.replace(randInt,randInt+1, "");
        }
        System.out.println(key.toString());

        // cypher algo
        alphabets= new StringBuffer(" abcdefghijklmnopqrstuvwxyz");
        for(int i= 0; i< message.length(); i++){
            char ch= message.charAt(i); // h
            for(int j=0; j< alphabets.length(); j++){
                if(ch== alphabets.charAt(j)){
                    encryptedString.append(key.charAt(j));
                    break;
                }
            }
        }

        System.out.println(encryptedString.toString());

        // easy way
        encryptedString= new StringBuffer("");
        for(int i= 0; i< message.length(); i++){
            char ch= message.charAt(i); // h
            int index= alphabets.indexOf(""+ ch);
            encryptedString.append(key.charAt(index));
        }
        System.out.println(encryptedString.toString());
    }
}
