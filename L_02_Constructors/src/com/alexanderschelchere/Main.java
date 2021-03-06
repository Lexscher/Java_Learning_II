package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
//        BankAccount FaZeRug = new BankAccount();
//        System.out.println(FaZeRug.getAccountNumber());
//        FaZeRug.withdraw(20);
//
//        BankAccount Jack = new BankAccount();
//
//        Jack.setAccountNumber(101);
//        Jack.setBalance(300);
//        Jack.setCustomerName("Jack Kurapika");
//        Jack.setEmail("scarletEyes@greedisland.com");
//        Jack.setPhoneNumber("(718) 303 - 1998");
//
//        Jack.withdraw(20);
//        Jack.withdraw(400);
//        Jack.deposit(700);
//        Jack.withdraw(400);
//
//        BankAccount Jill = new BankAccount(98, 1500, "Jill Saitama", "seriousseries@onepunch.com", "(718) 201-2009");
//        Jill.deposit(20000);
//
//        BankAccount Dexter = new BankAccount("Dexter", "donottouchthatbutton@mylaboratory.com", "(718) 354 - 2048");
//        Dexter.deposit(20);

        // CHALLENGE:
        // Create a new class VipCustomer
        // it should have 3 fields: name, credit limit, email address.
        // Create 3 constructors.
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3d.
        // 3rd constructor should save all fields
        // create getters only or this, using code generation of intellij as setters won't be needed.

        VipCustomer Banks = new VipCustomer("Agent Cody Banks", 50000);
        System.out.println(Banks.getName() + " " + Banks.getEmail() + ": " + Banks.getCreditLimit());

    }
}

/* CHALLENGE!!
Make a class for a bank account.
This class should have an account number, balance, customer name, email, and phone number
// Make getters and setters for each.
// Make two additional methods for depositing and withdrawing money from the balance.
// If the amount to withdraw is greater than the balance, veto the withdrawal request
 */