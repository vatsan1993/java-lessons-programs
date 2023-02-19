package Chap4.Ex20;

import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private double[] marks;

    public Student(String name, int age, double[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public double calcAverage(){
        double total=0;
        for(double mark: marks){
            total+=mark;
        }
        return total/marks.length;
    }

    public static double calcClassAverage(Student... s){
        if(s.length==0){
            return 0;
        }
        double total= 0;
        for(Student stu: s){
            total+= stu.calcAverage();
        }
        return total/s.length;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + Arrays.toString(marks) +
                ", Average="+ calcAverage()+
                '}';
    }
}
