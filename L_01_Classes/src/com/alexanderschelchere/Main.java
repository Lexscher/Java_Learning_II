package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        Car Tesla = new Car();
        Car Porsche = new Car();

        Tesla.setModel("Model X");
        Porsche.setModel("911");

        System.out.println("This is the " + Tesla.getModel());
        System.out.println("This is the " + Porsche.getModel());
    }
}
