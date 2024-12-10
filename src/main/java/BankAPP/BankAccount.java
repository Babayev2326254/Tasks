package BankAPP;

import java.util.Scanner;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private int accountNumber;

    public BankAccount(String accountHolder, double balance, int accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;

    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please indicate the amount you will deposit into the account?");
        amount = in.nextDouble();
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please indicate the amount you will withdraw to the account?");
        amount = in.nextDouble();
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("There are not enough funds in the account.");
        }
    }

    public void displayinfo() {
        System.out.println("Name" + accountHolder);
        System.out.println("ID" + accountNumber);
        System.out.println("Balance" + balance);
    }

    public void transfer(BankAccount recipient, double amount) {
        if (this.balance < amount) {
            System.out.println("There are not enough funds in the account.");
            return;
        }
        this.balance -= amount;

        recipient.balance += amount;

        System.out.println("Access");
    }

}
