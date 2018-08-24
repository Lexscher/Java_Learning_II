package com.alexanderschelchere;

public class Sink {
    private String color;
    private String material;
    private String model;
    private int hotWater;
    private int coldWater;
    private boolean hasSoap;
    private boolean handsWashed;

    private Sink(String color, String material, String model, int hotWater, int coldWater, boolean hasSoap, boolean handsWashed) {
        this.color = color;
        this.material = material;
        this.model = model;
        this.hotWater = hotWater;
        this.coldWater = coldWater;
        this.hasSoap = hasSoap;
        this.handsWashed = handsWashed;
    }

    public Sink(String color, String material, String model) {
        this(color, material, model, 0, 0, false, false);
    }

    private void hotTapUp() {
        if (this.hotWater <= 10) {
            this.hotWater += 2;
        } else {
            System.out.println("Darn! I don't think I can make the water hotter");
        }
    }

    private void coldTapUp() {
        if (this.coldWater <= 10) {
            this.coldWater += 2;
        } else {
            System.out.println("Darn! I don't think I can make the water colder");
        }
    }

    private void hotTapDown() {
        if (this.hotWater >= 0) {
            this.hotWater -= 2;
        } else {
            System.out.println("The hot water's already off... Doesn't get any lower than that!");
        }
    }

    private void coldTapDown() {
        if (this.coldWater >= 0) {
            this.coldWater -= 2;
        } else {
            System.out.println("The cold water's already off... Doesn't get any lower than that!");
        }
    }

    private void turnOffFaucet() {
        this.coldWater = 0;
        this.hotWater = 0;
    }

    private void pumpSoap() {
        System.out.println("the wonderful smell of soap.");
    }

    private void replenishSoap() {
        System.out.println("Let me get more soap from the cabinet!");
        hasSoap = true;
    }

    public void washHands() {
        if (!hasSoap) {
            System.out.println("???");
            System.out.println("There's no soap");
            replenishSoap();
            System.out.println("Great! Now we can use soap to wash our hands.");
        }
        if (this.coldWater + 2 < this.hotWater) {
            System.out.println("I can't wash my hands, this water's way too hot!");
            return;
        }
        if (this.hotWater + 2 < this.coldWater) {
            System.out.println("I can't wash my hands, this water's way too cold!");
            return;
        }
        if (this.hotWater == 0) {
          hotTapUp();
        }

        if(this.coldWater == 0) {
            coldTapUp();
        }
        pumpSoap();
        System.out.println("Washin' and rinsing!");
        this.handsWashed = true;
        turnOffFaucet();
        System.out.println("Just drying my hands!");
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getModel() {
        return model;
    }

    public int getHotWater() {
        return hotWater;
    }

    public int getColdWater() {
        return coldWater;
    }

    public boolean isHasSoap() {
        return hasSoap;
    }

    public boolean isHandsWashed() {
        return handsWashed;
    }
}
