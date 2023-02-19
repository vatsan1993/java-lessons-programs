package ch2;// Changing value in arrays and its problems, array length
import java.util.Arrays;
import java.util.Scanner;

public class Chap2Ex4 {
    public static void main(String[] args) {
        String[] groceryList= {"Apples", "Oranges", "Bananas"};
        groceryList[2] = "Kiwis";
        System.out.println(Arrays.toString(groceryList));
        //groceryList[2] = 10; // Syntax error

        System.out.println(groceryList.length);
        int length= groceryList.length;
        System.out.println(length);





    }
}
