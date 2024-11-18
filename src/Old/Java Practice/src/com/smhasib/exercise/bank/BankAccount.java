package com.smhasib.exercise.bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        if(money<0) {
            System.out.println("Invalid Request!\n");
        } else if(money<20) {
            System.out.println("Deposite atleast 20tk..\n");
        } else {
            balance += money;
            System.out.printf("You have deposited %.2f taka just now! Your current balance is: %.2f taka.\n", money, balance);
        }
    }

    public void withdraw(double money) {
        if(money>balance) {
            System.out.printf("You haven't that much money! Your current balance is: %.2f taka.\n", balance);
        } else if(money<0) {
            System.out.printf("Invalid Request!\n");
        } else {
            balance -= money;
            System.out.printf("You have withdraw %f taka just now! Your current balance is: %.2f taka.\n", money, balance);
        }
    }

    @Override
    public String toString() {
        return "[accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
                + balance + "]";
    }

}
