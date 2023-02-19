package Chap4.Ex21;

import java.util.Arrays;
// Compile---javac Chap4/Ex21/TempConverter.java

// args stucture -- -units measuremntUnit -temp value
//java Chap4/Ex21/TempConverter -temp 273.5 -units c
//java Chap4/Ex21/TempConverter -t 273.5 -u c
//java Chap4/Ex21/TempConverter -u c -t 273.5
public class TempConverter {
    public static void main(String[] args) {
        if(args.length!=4){
            System.out.println("Not valid args");
        }
        else{
            String op1= args[0];
            String op2= args[2];
            double temp=0;
            String units="";
            if((op1.equals("-t") || op1.equals("-temp") )&&(op2.equals("-units") || op2.equals("-u"))){
                // assuming number is provided after the -temp
                temp= Double.parseDouble(args[1]);
                units= args[3];
            }
            else if((op1.equals("-u") || op1.equals("-units") )&&(op2.equals("-temp") || op2.equals("-t"))){
                temp= Double.parseDouble(args[3]);
                units= args[1];
            }
            else{
                System.out.println("Invalid format");
                System.exit(1);
            }

            convertTemp(temp, units);
        }
    }

    public static void convertTemp(double temp, String units){
        if(units.equals("c")){
            // conv to F
            double result= (temp * 9/5) + 32;
            System.out.println(result+ " F");
        }
        else{
            // convert to C
            double result= (temp- 32) * 5/9 ;
            System.out.println(result+ " C");

        }
    }
}
