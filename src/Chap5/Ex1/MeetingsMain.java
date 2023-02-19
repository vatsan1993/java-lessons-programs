package Chap5.Ex1;

import java.util.Date;

public class MeetingsMain {
    public static void main(String[] args) {
        Date d1= new Date(2022,9,10,5,0);
        Date d2= new Date(2022,9,15,5,0);
        Date d3= new Date(2022,9,20,5,0);
        Meeting m1= new Meeting(1,"Math", "John",d1, false, 0);

        Student s1= new Student("Max", 20);
        s1.addMeeting(m1);
        System.out.println(s1);

    }
}
