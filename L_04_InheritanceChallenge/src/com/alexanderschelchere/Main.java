package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        Car elon = new Car("electric", "Tesla", "Model S");
        System.out.println(elon.getModel());
        System.out.println(elon.getMake());

        elon.pedalToTheMetal(3);
        elon.accelerate();
        elon.switchGear(5);
        elon.accelerate();
        elon.pedalToTheMetal(1);
        elon.accelerate();
        elon.switchGear(6);
        elon.accelerate();

        AlexsCar awesome = new AlexsCar(true);
        awesome.pedalToTheMetal(2);
        awesome.switchGear(5);
        awesome.accelerate();
    }

}

/*
CHALLENGE:
- Start with a base class of a Vehicle, then create a Car class
    that inherits from this base class.
- Finally, create a specific type of Car that inherits from the Car class.
- You should be able to: hand steering, changing gears, and moving (speed).
- You will want to decide where to put the appropriate
    state and behaviors (fields and methods).
- As mentioned above, changing gears, increasing/decreasing speed should be
    included.
- For your specific type of vehicle you will want to add
    something specific for that type of car.
*/