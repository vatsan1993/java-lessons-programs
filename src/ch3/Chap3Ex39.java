package ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Chap3Ex39 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter staring value: ");
        int start= sc.nextInt();
        System.out.println("Enter ending value: ");
        int end= sc.nextInt();

        int[] primes;
        int count= 0;
        // finding count for the number of primes
        for(int num= start; num<=end; num++){
            boolean isPrime= true;
            for(int j= 2; j<= Math.sqrt(num); j++){
                if(num%j==0){
                    isPrime= false;
                    break;
                }
            }
            if (isPrime){
                count++;
            }
        }
        System.out.println(count +" primes are available between "+start+ " and "+end );

        // placing primes in the array
        primes= new int[count];

        for(int num= start, m= 0; num<=end && m< primes.length; num++){
            boolean isPrime= true;
            for(int j= 2; j< Math.sqrt(num); j++){
                if(num%j==0){
                    isPrime= false;
                    break;
                }
            }
            if (isPrime){
                primes[m]= num;
                m++;
            }
        }
        System.out.println(Arrays.toString(primes));
    }
}
