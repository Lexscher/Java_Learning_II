package com.alexanderschelchere;

public class HealthyBurger extends Hamburger {
    private String healthyTopping1Name;
    private double healthyTopping1Price;

    private String healthyTopping2Name;
    private double healthyTopping2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyTopping1 (String name, double price) {
        this.healthyTopping1Name = name;
        this.healthyTopping1Price = price;
    }

    public void addHealthyTopping2 (String name, double price) {
        this.healthyTopping2Name = name;
        this.healthyTopping2Price = price;
    }

    @Override
    public double total() {
        double price = super.total();
        if (this.healthyTopping1Name != null) {
            price += this.healthyTopping1Price;
            System.out.println("Added " + this.healthyTopping1Name + " for an extra $" + this.healthyTopping1Price);
        }
        if (this.healthyTopping2Name != null) {
            price += this.healthyTopping2Price;
            System.out.println("Added " + this.healthyTopping2Name + " for an extra $" + this.healthyTopping2Price);
        }

        return price;
    }
}
