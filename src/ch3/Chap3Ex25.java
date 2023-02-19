package ch3;// String Split

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chap3Ex25 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String inputString= br.readLine();
        inputString= inputString.trim();
        String[] words= inputString.split(" "); //
        for (int i=0; i< words.length; i++){
            System.out.println(words[i]);
        }
    }
}
