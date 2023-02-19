package Chap4.Ex25;



public class Recurr2 {
    public static void main(String[] args) {
        int ears= bunnyEars(5);
        System.out.println(ears);
        System.out.println(power(2,5));
        System.out.println(power(2, -2));
    }

    public static double power(int value, int power){
        if(power==0){
            return 1;
        }
        if(power< 0){
            return 1/power(value,Math.abs(power));
        }
        return value * power(value,power-1);
    }



    public static int bunnyEars(int numBunnies){
        if(numBunnies==0){
            return 0;
        }
        return 2+bunnyEars(numBunnies-1);
    }


}
