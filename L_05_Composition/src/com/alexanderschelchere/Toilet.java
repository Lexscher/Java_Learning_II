package com.alexanderschelchere;

public class Toilet {
    private String model;
    private boolean usedThisVisit;

    private Toilet(String model, boolean usedThisVisit) {
        this.model = model;
        this.usedThisVisit = usedThisVisit;
    }

    public Toilet(String model) {
        this(model, false);
    }

    public void royalFlush() {
        System.out.println("Woooshhh");
        this.usedThisVisit = true;
    }

    public String getModel() {
        return model;
    }

    public boolean isUsedThisVisit() {
        return usedThisVisit;
    }

}
