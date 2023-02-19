package Chap5.Ex1;

import java.util.Date;

public class Meeting {
    private int id;
    private String subject;
    private String teacher;
    private Date date;
    private boolean finished;
    private int attendedStudents;

    public Meeting(int id,String subject, String teacher, Date date, boolean finished, int attendedStudents) {
        this.id= id;
        this.subject = subject;
        this.teacher = teacher;
        this.date = date;
        this.finished = finished;
        this.attendedStudents = attendedStudents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public int getAttendedStudents() {
        return attendedStudents;
    }

    public void attendMeeting(int students){
        this.attendedStudents=students;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", teacher='" + teacher + '\'' +
                ", date=" + date +
                ", finished=" + finished +
                ", attendedStudents=" + attendedStudents +
                '}';
    }
}
