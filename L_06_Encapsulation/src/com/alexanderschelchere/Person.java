package com.alexanderschelchere;

public class Person {

    private String name;
    private int age;
    private String occupation;

    public Person() {
        this("Chrollo", 26, "Founder: Phantom Troupe");
    }

    private Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public void getInformation() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getOccupation());
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    private String getOccupation() {
        return occupation;
    }
}
