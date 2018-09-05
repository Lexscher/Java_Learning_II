package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "Hamburg Steak", 3.65, "white");
	    double price = hamburger.total();
	    hamburger.addTopping1("Tomato", 0.27);
	    hamburger.addTopping2("Spinach", 1.05);
	    hamburger.addTopping3("Mushrooms", 1.25);
        System.out.println("Total Burger price is $" + hamburger.total()) ;
    }
}
