package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "Hamburg Steak", 3.65, "white");
	    double price = hamburger.total();
	    hamburger.addAddon1("Tomato", 0.27);
	    hamburger.addAddon2("Spinach", 1.05);
	    hamburger.addAddon3("Mushrooms", 1.25);
        System.out.println("Total Burger price is $" + hamburger.total()) ;

        HealthyBurger healthyBurger = new HealthyBurger("turkey", 5.67);
        healthyBurger.addAddon1("kale", 1.42);
        System.out.println(healthyBurger.total());

        DeluxeBurger db = new DeluxeBurger();
        db.addAddon1("Fish Tacos", 7.98);
        db.total();
    }

}
