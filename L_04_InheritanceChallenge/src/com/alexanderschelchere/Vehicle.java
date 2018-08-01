package com.alexanderschelchere;

public class Vehicle {

    private String engine;
    private int ground;
    private int sea;
    private int sky;

    public Vehicle(String engine, int ground, int sea, int sky) {
        this.engine = engine;
        this.ground = ground;
        this.sea = sea;
        this.sky = sky;
    }

    public String getEngine() {
        return engine;
    }

    public int isGround() {
        return ground;
    }

    public int isSea() {
        return sea;
    }

    public int isSky() {
        return sky;
    }
}
