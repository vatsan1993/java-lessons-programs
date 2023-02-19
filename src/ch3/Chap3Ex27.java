package ch3;

public class Chap3Ex27 {
    public static void main(String[] args) {
        String myString="How are you?";
        String reverse= "";
        for(int i= 0; i< myString.length(); i++){
            reverse= myString.charAt(i)+ reverse;
        }
        System.out.println(reverse);


    }
}
