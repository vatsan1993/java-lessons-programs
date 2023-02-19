package ch3;// Standard deviation


public class Chap3Ex26 {
    public static void main(String[] args) {
        // Mean
        double[] arr1= {2,5,7,347,4,43,5};
        double total= 0;
        for(int i=0; i< arr1.length; i++){
            total+=arr1[i];
        }
        double mean = total/arr1.length;
        System.out.println(mean);


        // std
        double summation= 0;
        for(int i=0; i<arr1.length;i++){
            summation+=  Math.pow(((arr1[i]-mean)/arr1.length), 2);
        }
        double std= Math.sqrt(summation);
        System.out.println(std);

    }
}
