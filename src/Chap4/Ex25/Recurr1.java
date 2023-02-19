package Chap4.Ex25;

public class Recurr1 {
    public static String printHi(int i, StringBuffer result){
        // base case
        if(i>=5){
            return result.toString();
        }
        if( i== 4){
            result.append("hi");
        }
        else{
            result.append("hi\n");
        }

        i++; // recurrsive step
        return printHi(i , result); // recursive call
    }

    public static void main(String[] args) {
        StringBuffer buff= new StringBuffer("");
        String result= printHi(0, buff);
        System.out.println(result);

    }

}
