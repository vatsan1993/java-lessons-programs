package Chap5.Ex8;

public class Alphanso extends Mango{
    private final int SWEETNESS_LEVEL= 9;

    public Alphanso(){
        super(false);
    }

    @Override
    public String toString() {
        return "Alphanso{" +
                "SWEETNESS_LEVEL=" + SWEETNESS_LEVEL +
                ", type='" + type + '\'' +
                ", Seed="+ hasSeed+
                '}';
    }
}
