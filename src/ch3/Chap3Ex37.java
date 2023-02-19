package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Chap3Ex37 {
    public static void main(String[] args) throws IOException {
        String keyword="bye";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a message: ");

        String message= br.readLine().toLowerCase();


        // Easiest way
        //1
        message= message.replaceAll(keyword, "");
        System.out.println(message);

        //2
        System.out.println("Enter a message: ");
        message= br.readLine().toLowerCase();
        String[] keywords= {"hi", "bye"};
        for(int i= 0; i< keywords.length; i++){
            String key= keywords[i];
            message= message.replaceAll(key, ""); //
        }
        System.out.println(message);



        // hard way
        // 1
        System.out.println("Enter a message: ");
        StringBuffer message2=new StringBuffer( br.readLine().toLowerCase() );

        for(int i=0; i< message2.length()-1;){
            String word= message2.substring(i, i+keyword.length());

            if (word.equals(keyword)){
                message2.replace(i, i+keyword.length(), "");

            }
            else{
                i++;
            }
        }
        System.out.println(message2.toString());


        System.out.println("Enter a message: ");
         message2=new StringBuffer( br.readLine().toLowerCase() );

        for(int i= 0; i< keywords.length; i++){
            String key=keywords[i];
            System.out.println(key);
            for(int j=0; j< message2.length()-1; ){

                String word= message2.substring(j, j+key.length());

                if (word.equals(key)){
                    message2.replace(j, j+key.length(), "");

                }
                else{
                    j++;
                }
            }
        }
        System.out.println(message2.toString());
    }
}


//hi how are you bye bye