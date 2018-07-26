package com.alexanderschelchere;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // SET
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // GET
    public int getAccountNumber(int accountNumber) {
        return this.accountNumber;
    }

    public int getBalance(int balance) {
        return this.balance;
    }

    public String getCustomerName(String customerName) {
        return this.customerName;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public String getPhoneNumber(String phoneNumber) {
        return this.phoneNumber;
    }

    //
    public int deposit(int money) {
        System.out.println(this.customerName + ". You are adding $" + money + " to your account, with a current balance of $" + this.balance + " dollars.");
        this.balance += money;
        System.out.println(this.customerName + ". Your new balance is $" + this.balance + " dollars.");
        return balance;
    }

    public int withdraw(int money) {
        if (this.balance > money) {
            System.out.println(this.customerName + ". You are withdrawing $" + money + " from your account, that has a balance of $" + this.balance + " dollars.");
            this.balance -= money;
            System.out.println(this.customerName + ". Your new balance is " + this.balance + " dollars.");
            return balance;
        } else {
            System.out.println("INSUFFICIENT FUNDS");
            System.out.println("Available Funds: $" + this.balance + " dollars.");
            System.out.println(this.customerName + ". I'm afraid that you are $" + (money - this.balance) + " short, pal.");
            return balance;
        }
    }

}
