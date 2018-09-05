package com.alexanderschelchere;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String buns;

    private String addon1Name;
    private double addon1Price;

    private String addon2Name;
    private double addon2Price;

    private String addon3Name;
    private double addon3Price;

    private String addon4Name;
    private double addon4Price;

    public Hamburger(String name, String meat, double price, String buns) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.buns = buns;
    }

    public void addAddon1(String name, double price) {
        this.addon1Name = name;
        this.addon1Price = price;
    }

    public void addAddon2(String name, double price) {
        this.addon2Name = name;
        this.addon2Price = price;
    }

    public void addAddon3(String name, double price) {
        this.addon3Name = name;
        this.addon3Price = price;
    }

    public void addAddon4(String name, double price) {
        this.addon4Name = name;
        this.addon4Price = price;
    }

    public double total() {
        double price = this.price;
        System.out.println(this.name + " hamburger with " + this.meat + " on " + this.buns
                    + " costs $" + this.price);
        if (this.addon1Name != null) {
            price += this.addon1Price;
            System.out.println("Added " + this.addon1Name + " for an extra $" + this.addon1Price);
        }
        if (this.addon2Name != null) {
            price += this.addon2Price;
            System.out.println("Added " + this.addon2Name + " for an extra $" + this.addon2Price);
        }
        if (this.addon3Name != null) {
            price += this.addon3Price;
            System.out.println("Added " + this.addon3Name + " for an extra $" + this.addon3Price);
        }
        if (this.addon4Name != null) {
            price += this.addon4Price;
            System.out.println("Added " + this.addon4Name + " for an extra $" + this.addon4Price);
        }
        return price;
    }

}

