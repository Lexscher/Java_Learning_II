package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        BankAccount Jack = new BankAccount();

        Jack.setAccountNumber(101);
        Jack.setBalance(300);
        Jack.setCustomerName("Jack Kurapika");
        Jack.setEmail("scarletEyes@greedisland.com");
        Jack.setPhoneNumber("(718) 303 - 1998");

        Jack.withdraw(20);
        Jack.withdraw(400);
        Jack.deposit(700);
        Jack.withdraw(400);

    }
}

/* CHALLENGE!!
Make a class for a bank account.
This class should have an account number, balance, customer name, email, and phone number
// Make getters and setters for each.
// Make two additional methods for depositing and withdrawing money from the balance.
// If the amount to withdraw is greater than the balance, veto the withdrawal request
 */