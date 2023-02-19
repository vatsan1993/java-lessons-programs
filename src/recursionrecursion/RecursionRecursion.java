package recursionrecursion;
public class RecursionRecursion {
    public static void main(String[] args) {
        recur(0);
        System.out.println(factorial(5));
        System.out.println(collatz(5));
    }
    //If the number is even, divide it by two.
    //If the number is odd, triple it and add one.
    
    //4 -> 2 -> 1
    //collatz(4) = 3
    //1 + collatz(the rest)
    static int collatz(int n){
        //base case
        if(n == 1) return 1; 
        //2 recursive cases
        if(n % 2 == 0) return 1 + collatz(n/2);
        else           return 1 + collatz(3*n+1);
        
    }
    //recursive factorial
    //1! = 1, 0! = 1
    //5! = 5 * (4 * 3 * 2 * 1) = 120
    //5! = 5 * 4!
         //5 * 4 * 3!
    //n! = n*n-1*...*1
    //n! = n * (n-1)!
    //count to 10
    static long factorial(long n){
        if(n==0)return 1;
        return n * factorial(n-1);   
    }
     
    static void recur(int n){
        //base case -- when we quit
        if(n > 10) return;
        //recursive case
        System.out.println("n = " + n);
        recur(n+1);
        //return to right here
        System.out.println("n = " + n);
    }
}
//a recursive method is a method that calls itself