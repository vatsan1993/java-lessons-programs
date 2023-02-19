package Chap5.Ex6;

public class CheckingAccount extends BankAccount {
    private double insufficientFundsFee;
    private final double MINIMUM_FUNDS_NEEDED= 500;

    public CheckingAccount(String owner, double balance,double insufficientFundsFee) {
        super(owner,balance);
        this.insufficientFundsFee = insufficientFundsFee;
    }

    public double getInsufficientFundsFee() {
        return insufficientFundsFee;
    }

    public void setInsufficientFundsFee(double insufficientFundsFee) {
        this.insufficientFundsFee = insufficientFundsFee;
    }

    public double getMINIMUM_FUNDS_NEEDED() {
        return MINIMUM_FUNDS_NEEDED;
    }


    public void processCheck(Check check){
        deposit(check.getAmount());
    }
    public boolean withdraw(double amount){
        balance=balance-amount;
        if(balance<MINIMUM_FUNDS_NEEDED){
            balance=balance- insufficientFundsFee;
        }
        return true;
    }

    public String getClassName(){
        return  "CheckingAccount";
    }


}
