package Chap4.Ex7;

public class OperationsMain {
    public static void main(String[] args) {
        Operations o1=new Operations();
        int res1= o1.add(4,5);
        int res2= o1.sub(res1, 10);
        int res3= o1.mul(res2, res1);
        double res4= o1.div(res3, 10);
        System.out.println(res4);
    }
}
