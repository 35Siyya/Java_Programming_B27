package day38_encapculation;

public class BankAccount {

    //this file will be read-only/you can't never change it.its fixed

    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    //there is no setter methods so, you can never change the values
}
