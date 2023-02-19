package Chap4.Ex26;

public class Die {
    private final int MAXVALUE= 6;
    private int dieFace;

    public Die() {
        dieFace= 1;
    }

    public int getDieFace() {
        return dieFace;
    }

    public void setDieFace(int dieFace) {
        this.dieFace = dieFace;
    }
    public int roll(){
        int value= (int)(Math.random() * (6 - 1 + 1) + 1);
        dieFace= value;
        return dieFace;
    }

    @Override
    public String toString() {
        return "Die{" +
                "dieFace=" + dieFace +
                '}';
    }
}
