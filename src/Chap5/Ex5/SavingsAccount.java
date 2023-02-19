package Chap5.Ex5;

public class SavingsAccount extends BankAccount{
    private double annualInterestRate;

    public SavingsAccount(String owner, double balance,double annualInterestRate) {
        super(owner,balance);
        this.annualInterestRate = annualInterestRate;
    }

    public void depositMonthlyInterest(){
        setBalance(getBalance()+getBalance()* annualInterestRate/100);
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    public String getClassName(){
        return  "SavingsAccount";
    }
    @Override
    public String toString() {
        return getClassName()+"{" +super.getDetails()+
                ", annualInterestRate=" + annualInterestRate +
                '}';
    }
}
