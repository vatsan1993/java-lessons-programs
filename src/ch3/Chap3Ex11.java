package ch3;// Demo for while with if

public class Chap3Ex11 {
    public static void main(String[] args) {
        int counter=1;
        while (counter <=100){
            if(counter %2==0){
                System.out.println(counter + " is even");
            }
            else{
                System.out.println(counter + " is odd");
            }
            counter+=1;
        }

    }
}
