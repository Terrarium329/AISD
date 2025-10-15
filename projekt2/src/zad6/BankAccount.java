package zad6;

import zad4.Dog;

public class BankAccount {

    private int accountNumber;
    private String owner;
    private int balance;
    private String accountType;

    public BankAccount(int accountNumber, String owner, int balance, String accountType){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void print(){
        System.out.println(this.balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }


    public void deposit(double amount){
        this.balance += amount;
        }

    public void withdraw(double amount){
        this.balance -= amount;
        }



}
