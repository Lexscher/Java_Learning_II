package com.alexanderschelchere;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {
        System.out.println("Muscles are a-movin'");
    }

    private void moveBackFin() {
        System.out.println("Back fin is a-flappin'");
    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
