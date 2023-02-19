package Chap5.Ex8;

public class Fruit {
    protected String type;
    protected boolean hasSeed;

    public Fruit(String type, boolean hasSeed) {
        this.type = type;
        this.hasSeed = hasSeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasSeed() {
        return hasSeed;
    }

    public void setHasSeed(boolean hasSeed) {
        this.hasSeed = hasSeed;
    }
}
