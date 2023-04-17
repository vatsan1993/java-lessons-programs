package ch1;

import java.util.Random;
// Example for Random Values
public class Chap1Ex24 {
    public static void main(String[] args) {
        Random random= new Random();
        System.out.println(random.nextInt());

        System.out.println(random.nextDouble());


        Random r= new Random(10);
        System.out.println(r.nextInt());

    }
}
