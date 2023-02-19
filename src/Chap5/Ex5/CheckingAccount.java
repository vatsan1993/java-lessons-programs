package Chap5.Ex5;

public class CheckingAccount extends BankAccount{
    private double insufficientFundsFee;
    private double MINIMUM_FUNDS_NEEDED= 500;

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

    public void setMINIMUM_FUNDS_NEEDED(double MINIMUM_FUNDS_NEEDED) {
        this.MINIMUM_FUNDS_NEEDED = MINIMUM_FUNDS_NEEDED;
    }

    public void processCheck(Check check){
        deposit(check.getAmount());
    }
    public boolean withdraw(double amount){
        setBalance(getBalance()-amount);
        if(getBalance()<MINIMUM_FUNDS_NEEDED){
            setBalance(getBalance()- insufficientFundsFee);
        }
        return true;
    }

    public String getClassName(){
        return  "CheckingAccount";
    }


}
