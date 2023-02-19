package ch3;// Demo for a while loop with numbers

public class Chap3Ex10 {
    public static void main(String[] args) {
        int counter= 1;
        int total= 0;
        while (counter<=5){
            System.out.println(counter);
            total+=counter;
            counter++;
        }
        System.out.println("Total "+total);
        System.out.println("End of while loop");



    }
}
