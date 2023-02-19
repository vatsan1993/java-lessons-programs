package ch3;// vowels in each word
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap3Ex35 {
    public static void main(String[] args) throws IOException {
        String vowels= "aeiou";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a message: ");

        String message= br.readLine();

        String[] words= message.split(" ");
        for(int i=0; i< words.length; i++){
            String word= words[i];
            System.out.print(word + "- ");
            for(int j=0; j< vowels.length(); j++){
                if(word.contains(""+ vowels.charAt(j))){
                    System.out.print(vowels.charAt(j) + " ");
                }
            }
            System.out.println();
        }
    }
}
