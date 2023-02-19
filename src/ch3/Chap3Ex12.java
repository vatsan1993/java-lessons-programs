package ch3;

import java.util.Scanner;

public class Chap3Ex12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number or 'Stop' to stop the program.");
        String inputVal= sc.next();
        int total= 0;
        while (!inputVal.equals("stop")){
            total+= Integer.parseInt(inputVal);
            System.out.println("Enter a number or 'Stop' to stop the program.");
            inputVal= sc.next();
        }
        System.out.println(total);

    }
}
