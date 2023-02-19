package Chap4.Ex16;

public class StdUtility {
    public static double mean(double[] arr){
        double sum= 0;
        for(double val: arr){
            sum+=val;
        }
        return sum/arr.length;
    }
    public static double variance(double[] arr){
        double mean= mean(arr);
        double summation=0;
        for(double val: arr){
            summation+= Math.pow(val-mean , 2);
        }
        return summation/arr.length;
    }

    public static double std(double[] arr){
        double variance= variance(arr);
        return Math.sqrt(variance);
    }

//    public static void main(String[] args) {
//        double[] arr= {1,4,74,7,4};
//        System.out.println(std(arr));
//
//        double[] marks= {70,84.3,97.6,75.5,75,43 };
//        System.out.println(mean(marks));
//
//    }

}
