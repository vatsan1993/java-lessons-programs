package Chap5.Ex6;

public class Check {
    private int checkId;
    private String provider;
    private double amount;

    public Check(int checkId, String provider, double amount) {
        this.checkId = checkId;
        this.provider = provider;
        this.amount = amount;
    }


    public int getCheckId() {
        return checkId;
    }

    public void setCheckId(int checkId) {
        this.checkId = checkId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
