package com.alexanderschelchere;

public class Shower {
    private String showerHeadModel;
    private boolean bathtub;

    public Shower(String showerHeadModel, boolean bathtub) {
        this.showerHeadModel = showerHeadModel;
        this.bathtub = bathtub;
    }

    public String getShowerHeadModel() {
        return showerHeadModel;
    }

    public boolean isBathtub() {
        return bathtub;
    }
}
