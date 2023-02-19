package Chap5.Ex2;

import java.util.Arrays;

public class Employee {
    private int id;
    private static int nextID=1;
    private String name;
    private int age;
    private Employee[] subordinates;
    private  int MAX_SUBORDINATES;
    private double rating;
    private int count;

    public Employee(String name, int age, double rating) {

        id= nextID++;
        this.name = name;
        this.age = age;
        this.MAX_SUBORDINATES = 10;
        this.subordinates = new Employee[MAX_SUBORDINATES];
        this.rating = rating;
        count= 0;
    }
    public boolean isEmployeeExists(int id){
        // checking if the current employee has a specified subordinate
        // in immediate subbordinate
        for (Employee subordinate: subordinates){
            if(subordinate == null){
                break;
            }
            if(subordinate.isEmployeeExists(id)) {
                return true;
            }
            if(subordinate.id== id){
                return true;

            }
        }
        return false;
    }
    private boolean isEmpty(){
        return count==0;
    }

    private boolean isFull(){
        return count== MAX_SUBORDINATES;
    }

    public boolean addSubordinate(Employee employee){
        if(! isFull()){
            if(! isEmployeeExists(employee.id)){
                subordinates[count]= employee;
                count++;
                return true;
            }
            return false;
        }
        return false;
    }
    public double calcSubordinateRating(){
        double total= 0;
        for(Employee subordinate: subordinates){
            if (subordinate==null){
                break;
            }
            total+=subordinate.rating;
        }
        return total/ count;
    }
    public static double calcAllAverageSubordinateRating(Employee e){
        double[] details= new double[2];
        getSubordinatesRatingAvg(e, details);
        return details[0]/details[1];
    }


    private static void getSubordinatesRatingAvg(Employee emp, double[] details){
        if(emp== null){
            return ;
        }
        else {
            details[0]+=emp.rating;
            details[1]++;
            for (Employee e : emp.subordinates) {
                if (e == null){
                    break;
                }
                 getSubordinatesRatingAvg(e, details);
            }
            return ;
        }
    }

    public boolean removeSubordinate(int id){
        if(isEmpty()){
            return false;
        }
        else{
            for(int i= 0; i< subordinates.length; i++){
                if(subordinates[i].id== id){
                     remove(i);
                     count--;
                     return true;
                }
            }
            return false;
        }
    }
    private void remove(int index){
        for(int i= index+1; i< subordinates.length; i++){
            subordinates[i-1]=subordinates[i];
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Employee.nextID = nextID;
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

    public Employee[] getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Employee[] subordinates) {
        this.subordinates = subordinates;
    }

    public int getMAX_SUBORDINATES() {
        return MAX_SUBORDINATES;
    }

    public void setMAX_SUBORDINATES(int MAX_SUBORDINATES) {
        this.MAX_SUBORDINATES = MAX_SUBORDINATES;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", subordinates=" + Arrays.toString(subordinates) +
                ", rating=" + rating +
                ", count=" + count +
                '}';
    }
}
