package Chap4.Ex18;

public class StudentsMain {
    public static void main(String[] args) {
        double[] marks1= {76,85.5,86.4,67.5,43.5,34.6};
        double[] marks2= {89,67,86.5,86,54.4,75.6};
        double[] marks3= {67,90.6,98.6,92.3,87.4,78.4};
        Student student1= new Student("Max", 20,marks1);
        Student student2= new Student("Bill", 21,marks2);
        Student student3= new Student("Jake", 19,marks3);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("Class Average: "+ Student.calcClassAverage(student1,student2,student3));
    }
}
