package ch1;
// Description: A program that shows how to change values in variables.
public class Chap1Ex10 {
    public static void main(String[] args) {
        String name= "Max";
        int age= 20;
        double salaryPerDay= 245.3;

        name= "Bill";
        age = age+1;
        salaryPerDay= salaryPerDay+60;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salaryPerDay);


    }
}
