package recursionrecursion;
import java.util.List;
public class Day2 {
    public static void main(String[] args) {
//        7->3->4->[]  14
//        val is 7, list is 3->4->[]
//        7+sum(3->4->[])
//        
//        sum(3->4->[]) = ?
//        val is 3, list is 4->[]
//        7+(3+sum(4->[]))
//        
//        val is 4, list is []
//        4 + sum([])
//        
//        7+3+4+0= 14
//        List<Integer> example = List.of(1,2,3,4,5,6).subList(1, 5);
//        System.out.println(example);
//        System.out.println();
        List<Integer> abc = List.of(1,2,3,4,5);
        System.out.println(sum(abc));
        System.out.println(abc);
        
        int[] a = {1,77,2};
        System.out.println(max(a,a.length-1));
        System.out.println("HEY: " + fib(3));
        for (int i = 0; i < 20; i++) {
            System.out.println(fib(i));
            
        }
    }
    //recursive fib
    //negative numbers not allowed
    static long fib(int n){
        //base cases
        if(n <= 1) return 1;
        return fib(n-1)+fib(n-2);
    }
    //count down
    static int max(int[] ar,int i){
        System.out.println("i: " + i);
        if(i == 0) return ar[i]; //weve reached the last element
       
        int val = ar[i];
        int maxOfRest = max(ar,i-1);
        return Math.max(val, maxOfRest);
        
        
    }
    static int sum(List<Integer> nums){
        //base case
        if(nums.isEmpty()) return 0;
        
        //recursive case
        int val = nums.get(0); //first val
        List<Integer> list = nums.subList(1, nums.size()); //rest of vals
        return val + sum(list);       
        
    }
}
