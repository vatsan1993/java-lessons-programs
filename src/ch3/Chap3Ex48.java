package ch3;

import java.util.Random;

public class Chap3Ex48 {
    public static void main(String[] args) {

        String[] messages= {"how are you", "what are you doing", "i am playing"};

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

        alphabets= new StringBuffer(" abcdefghijklmnopqrstuvwxyz");
        for (String message: messages){
            for(char ch: message.toCharArray()){
                for(int j=0; j< alphabets.length(); j++){
                    if(ch== alphabets.charAt(j)){
                        encryptedString.append(key.charAt(j));
                        break;
                    }
                }
            }
        }


        System.out.println(encryptedString.toString());

        // easy way
        encryptedString= new StringBuffer("");
        for (String message: messages) {
            for (char ch: message.toCharArray()) {
                int index = alphabets.indexOf("" + ch);
                encryptedString.append(key.charAt(index));
            }
        }
        System.out.println(encryptedString.toString());


    }
}
