package Chap5.Ex6;

public class BankAccount {
    protected String owner;
    protected double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public boolean withdraw(double amount){
        if(amount> balance){
            return false;
        }
        balance-=amount;
        return true;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getClassName(){
        return  "BankAccount";
    }
    public String getDetails(){
        return "owner='" + owner + '\'' +
                ", balance=" + balance ;
    }


    @Override
    public String toString() {
        return getClassName()+"{" +getDetails()+ "}";

    }
}
