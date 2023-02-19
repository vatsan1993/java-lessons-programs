package ch2;// 1d array and Arrays.toString();
import java.util.Arrays;

public class Chap2Ex1 {
    public static void main(String[] args) {
        String[] groceryList= {"Apples", "Oranges", "Bananas"};
        double marks[]= {99.9, 64.6,45.6,34.0,76.4};
        System.out.println(groceryList);


        System.out.println(Arrays.toString(groceryList));
        System.out.println(Arrays.toString(marks));

    }
}
