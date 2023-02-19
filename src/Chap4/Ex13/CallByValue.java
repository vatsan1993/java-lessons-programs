package Chap4.Ex13;

public class CallByValue {
    public static void main(String[] args) {
        int x= 10;
        CallByValue obj= new CallByValue();
        obj.changeValue(x);
        System.out.println("After calling changeVal: "+ x);

    }

    public void changeValue(int a){
        a= 100;
        System.out.println("Inside method: "+ a);
    }
}
