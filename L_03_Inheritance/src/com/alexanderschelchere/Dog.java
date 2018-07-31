package com.alexanderschelchere;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Constructor call to the Animal class.
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // what we're inheriting/extending from our Animal class.
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("The dog is chewing it's food.");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called.");
        this.chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called.");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called.");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called.");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called.");
        moveLegs(speed);
        super.move(speed);
    }
}
