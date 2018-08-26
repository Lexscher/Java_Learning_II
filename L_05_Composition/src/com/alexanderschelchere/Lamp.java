package com.alexanderschelchere;

public class Lamp {
    private String style;
    private boolean bettery;
    private int globRating;

    public Lamp(String style, boolean bettery, int globRating) {
        this.style = style;
        this.bettery = bettery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBettery() {
        return bettery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
