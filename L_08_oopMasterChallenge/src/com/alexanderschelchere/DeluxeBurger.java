package com.alexanderschelchere;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Double Hamburg Steak", 14.54, "white");
        super.addAddon1("Chips", 2.75);
        super.addAddon2("Ginger Ale", 1.81);
    }

    @Override
    public void addAddon1(String name, double price) {
        System.out.println("Sorry! You can't add additional items to your Deluxe Burger Order.");
    }

    @Override
    public void addAddon2(String name, double price) {
        System.out.println("Sorry! You can't add additional items to your Deluxe Burger Order.");
    }

    @Override
    public void addAddon3(String name, double price) {
        System.out.println("Sorry! You can't add additional items to your Deluxe Burger Order.");
    }

    @Override
    public void addAddon4(String name, double price) {
        System.out.println("Sorry! You can't add additional items to your Deluxe Burger Order.");
    }
}
