package Chap5.Ex3;

public class Height {
    private int feet;
    private int inches;

    public Height(int feet, int inches){
        this.feet= feet;
        this.inches= inches;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    @Override
    public String toString() {
        return feet+"'"+ inches+ "''";
    }
}
