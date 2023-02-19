package Chap5.Ex2;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1= new Employee("max", 20,9.4);
        Employee e2= new Employee("Bill", 20,7.4);
        Employee e3= new Employee("james", 20,6.5);
        Employee e4= new Employee("Jake", 20,8.5);
        Employee e5= new Employee("Madison", 20,6.4);
        Employee e6= new Employee("Mike", 20,9.4);

        e1.addSubordinate(e2);
        e1.addSubordinate(e3);
        e3.addSubordinate(e4);
        e5.addSubordinate(e6);

        boolean result= e1.isEmployeeExists(7);
        System.out.println(result);

        System.out.println(e1.calcSubordinateRating());
        double res= Employee.calcAllAverageSubordinateRating(e1);
        System.out.println(res);
        e1.removeSubordinate(2);
        System.out.println(e1);



    }
}
