package com.alexanderschelchere;

public class Car extends Vehicle {

    private String make;
    private String model;
    private int gear;
    private int pedal;
    private int speed;


    public Car(String engine, String make, String model) {
        super(engine, 1, 0, 0);
        this.make = make;
        this.model = model;
        this.gear = 0;
        this.pedal = 0;
        this.speed = 0;
    }


    public Car(String engine, String make, String model, int gear, int pedal, int speed) {
        super(engine, 1, 0, 0);
        this.make = make;
        this.model = model;
        this.gear = gear;
        this.pedal = pedal;
        this.speed = speed;
    }



    public void accelerate(){
        if (this.gear == 1 || this.gear == 2 || this.gear == 3) {
            this.speed = (this.gear * 10) / 2;
        } else if (this.gear == 4) {
            this.speed = this.gear * 8;
        } else if (this.gear == 5) {
            this.speed =  this.gear * 10;
        } else if (this.gear == 6) {
            this.speed = this.gear * 2;
        }

        if (this.pedal == 0) {
            this.speed -= 2;
        } else if (this.pedal == 1) {
            this.speed += 2;
        } else if (this.pedal == 2) {
            this.speed += 8;
        } else if (this.pedal == 3) {
            this.speed += 12;
        }
        if (gear != 6) {
            System.out.println("The " + this.make + ", " + this.model + " has switched to gear " + this.gear + ", and is going forward, at " + this.speed + "mph.");
        } else {
            System.out.println("The " + this.make + ", " + this.model + " has switched to gear " + this.gear + ", and is going backwards, at " + this.speed + "mph.");
        }
    }

    public void pedalToTheMetal(int foot) {
        switch(foot) {
            case 1:
                System.out.println("soft");
                this.pedal = 1;
                break;
            case 2:
                System.out.println("medium");
                this.pedal = 2;
                break;
            case 3:
                System.out.println("WHOLE FOOT! FLOORING IT!!");
                this.pedal = 3;
                break;
            default:
                System.out.println("oop");
                this.pedal = 0;
                break;
        }
    }

    public void switchGear(int shift) {
        switch(shift) {
            case 1:
                System.out.println("Gear First: Used for moving off, manoeuvres and negotiating hazards");
                this.gear = 1;
                break;
            case 2:
                System.out.println("Gear Second: Used for slow speed situations such as roundabouts and junctions, for moving off downhill and for increasing speed after moving off.");
                this.gear = 2;
                break;
            case 3:
                System.out.println("Gear Third: Used for driving uphill, through a hazard at speed and where a greater degree of power is needed than fourth will allow.");
                this.gear = 3;
                break;
            case 4:
                System.out.println("Gear Fourth: Used for most driving situations at and over 30 mph where there are no hazard to negotiate.");
                this.gear = 4;
                break;
            case 5:
                System.out.println("Gear Fifth: Used for high speed cruising on dual carriageways, motorways and other such open roads.");
                this.gear = 5;
                break;
            case 6:
                System.out.println("Reverse: A high powered gear used for driving the vehicle backwards");
                this.gear = 6;
                break;
            default:
                System.out.println("Neutral: Disengage the engine from the wheels.");
                this.gear = 0;
                break;
        }
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getGear() {
        return gear;
    }

    public int getPedal() {
        return pedal;
    }

    public int getSpeed() {
        return speed;
    }
}
