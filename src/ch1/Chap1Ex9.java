package ch1;

// Examples for string concatenation
public class Chap1Ex9 {
    public static void main(String[] args) {
        String fname= "max";  // variable init.
        String lname= "Winchester";
        String fullName= fname+" "+lname;
        int age= 20;
        float marks= 99.9f;
        System.out.println("The name of the person is: "+ fullName);
        System.out.println(fullName+ " is "+ age+ " years old");
        System.out.println(fullName+ " scored "+ marks+ " marks");

    }
}
