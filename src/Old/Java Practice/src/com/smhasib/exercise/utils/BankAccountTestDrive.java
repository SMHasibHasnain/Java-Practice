package com.smhasib.exercise.utils;

import com.smhasib.exercise.bank.BankAccount;

public class BankAccountTestDrive {
    public static void main(String[] args) {
        BankAccount client1 = new BankAccount("1", "Hasib");
        BankAccount client2 = new BankAccount("2", "Hamim");
        System.out.println(client1.getBalance());
        client1.deposit(10);
        client1.deposit(-2);
        client1.deposit(200.00);
        client1.withdraw(1000);
        System.out.println(client1.getBalance());
        client1.withdraw(600);
        
        System.out.println(client2.getBalance());
        client2.deposit(200.00);
        client2.withdraw(1000);
        System.out.println(client2.getBalance());
        client2.withdraw(600);

        System.out.println(client1);
        System.out.println(client2);
    }
}
