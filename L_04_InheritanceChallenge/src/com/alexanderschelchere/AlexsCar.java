package com.alexanderschelchere;

public class AlexsCar extends Car {

    private boolean isItCool;

    public AlexsCar(boolean isItCool) {
        super("Electric", "Tesla", "Model X");
        this.isItCool = isItCool;
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void pedalToTheMetal(int foot) {
        super.pedalToTheMetal(foot);
    }

    @Override
    public void switchGear(int shift) {
        super.switchGear(shift);
    }

    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getGear() {
        return super.getGear();
    }

    @Override
    public int getPedal() {
        return super.getPedal();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}
