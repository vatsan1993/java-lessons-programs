package ch3;// Another Encryption


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap3Ex33 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your message: ");

        String message=br.readLine();
        StringBuffer encryptedString= new StringBuffer("");
        for(int i=0; i< message.length(); i++ ){
            if(message.charAt(i)==' '){
                encryptedString.append(' ');
                continue;
            }
            int charNum= message.charAt(i);
            charNum+=4;
            if(charNum> 122){
                charNum%=122;
                charNum+=96;
            }
            char numChar= (char) charNum;
            encryptedString.append(numChar);
        }
        System.out.println(encryptedString.toString());
    }
}
