package ch2;

public class Chap2Ex12 {
    public static void main(String[] args) {
        String name = "Max Winchester";
        int age= 20;
        double marks= 99.9;
        String name2 = "Billy Morgan";
        int age2= 19;
        double marks2= 65.435;
        String name3 = "James Radley";
        int age3= 21;
        double marks3= 74.3;
        System.out.println(String.format("%-15s %-10s %s","Name", "Age","Marks") );
        System.out.println(String.format("%-15s %-10d %5.2f",name, age, marks) );
        System.out.println(String.format("%-15s %-10d %5.2f",name2, age2, marks2) );
        System.out.println(String.format("%-15s %-10d %5.2f",name3, age3, marks3) );

    }
}
