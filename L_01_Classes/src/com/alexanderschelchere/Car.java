package com.alexanderschelchere;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Setter method
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("model x") || validModel.equals("carrera")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // Getter method
    public String getModel() {
        return this.model;
    }

}
