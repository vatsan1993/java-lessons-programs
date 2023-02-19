package Chap4.Ex13;

import Chap4.Ex12.Box;

import java.util.Arrays;

public class CallByReference {
    public static void main(String[] args) {
        int[] x= {1,2,3};
        CallByReference obj= new CallByReference();
        obj.changeArray(x);
        System.out.println("After calling changeArray: "+  Arrays.toString(x));


        Box b1= new Box(1, 15.4, 12.3, 7.3, "cms");
        obj.changeObj(b1);
        System.out.println("After calling changeObject: "+  b1.toString());
    }


    public void changeArray(int[] arr){
        arr[0]= 100;
        System.out.println("Inside method: "+ Arrays.toString(arr));
    }

    public void changeObj(Box b){
        b.setLength(30);
        System.out.println("Inside method: "+ b.toString());
    }
}
