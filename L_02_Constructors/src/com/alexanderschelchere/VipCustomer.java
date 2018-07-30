package com.alexanderschelchere;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    // Constructors
    public VipCustomer() {
        this("Bill", 10000, "bill@thehill.com");
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "bill@thehill.com");
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
