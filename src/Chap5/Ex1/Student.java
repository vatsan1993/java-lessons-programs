package Chap5.Ex1;

import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private Meeting[] meetings;
    private final int MAX_MEETINGS= 10;
    private int count;
    public Student(String name, int age){
        this.name= name;
        this.age= age;
        meetings= new Meeting[MAX_MEETINGS];
        count=0;
    }
    public boolean isMeetingExists(){
        if (meetings.length>0){
            return true;
        }
        return false;
    }
    public boolean addMeeting(Meeting meeting){
        if(count== MAX_MEETINGS){
            return false;
        }
        else{
            meetings[count]= meeting;
            count++;
            return true;
        }
    }
    private boolean isEmpty(){
        return count==0;
    }
    public boolean removeMeeting(int id){
        if (isEmpty()){
            return false;
        }
        int meetingIndex= -1;
        for(int i=0; i< meetings.length; i++){
            if(meetings[i].getId()== id){
                meetingIndex= i;
                break;
            }
        }
        if(meetingIndex!=-1){
            for(int i= meetingIndex; i<count-1;i++){
                meetings[i]= meetings[i+1];
            }
            meetings[count-1]= null;
            count--;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Number of Meetings:=" + count +
                ", meetings=" + Arrays.toString(meetings) +
                '}';
    }
}
