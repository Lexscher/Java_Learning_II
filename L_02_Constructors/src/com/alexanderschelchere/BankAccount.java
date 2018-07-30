package com.alexanderschelchere;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Constructors
    public BankAccount() {
        this(500281, 1, "Default Name", "Default Address", "Default Phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account Constructor With Parameters Called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100, customerName, email, phoneNumber);
    }

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
    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // 2 methods
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
