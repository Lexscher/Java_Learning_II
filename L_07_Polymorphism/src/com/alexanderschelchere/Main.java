package com.alexanderschelchere;

class Car {
    private String name;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
        return "*Horrible sound of an engine dying* \n *poof*";
    }

    public String accelerate() {
        return "*conk*";
    }

    public String brake() {
        return "I mean... It's already not moving...";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Chevrolet extends Car {
    public Chevrolet() {
        super("Corvette", 8);
    }

    @Override
    public String startEngine() {
        return "*REVVVVVVVVVVV* \n *BOWOWWOWWOWWOWWWOWWOWWWWW*";
    }

    @Override
    public String accelerate() {
        return "*ZOOOOOOOM* lignting fast!";
    }

    @Override
    public String brake() {
        return "*SCURRRRRRRRRRR*";
    }
}

class Ferrari extends Car {
    public Ferrari() {
        super("488 GTB", 8);
    }

    @Override
    public String startEngine() {
        return "*BOVVVVVVVVVVV* \n *REWWWWWWWW*";
    }

    @Override
    public String accelerate() {
        return "*ZEEEEEERR* Supa' Quick!";
    }

    @Override
    public String brake() {
        return "*SCUR-SCURR*";
    }
}

class brokenMater extends Car {
    public brokenMater() {
        super("Ol' Faithful )`:|7", 6);
    }

}

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
	        Car car = randomCar();
            System.out.println("Car No. " + i + " is the " + car.getName() + "\n Let's hear that engine Roar!!  " + car.startEngine()
                    + "\n Let's watch that car Move!!!  " + car.accelerate() + "\n Let's see how that evasive action - "  + car.brake() + "\n");
        }
        // Inline Class (Not recommended here, but seen a lot in Android programming for click listeners and such)
        Car ford = new Car("Ford Falcon", 6) {
            @Override
            public String startEngine() {
                return "Starterrrr UP *vuhbumbumbumbumbumbum*";
            }
            @Override
            public String accelerate() {
                return "*Whoooommmmm*";
            }
            @Override
            public String brake() {
                return "*Sksssshhhhhhhhrth*";
            }
        };
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }

        public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Chevrolet();
            case 2:
                return new Ferrari();
            case 3:
                return new brokenMater();
        }
        return null;
    }

}

/*
    Challenge!
    We are going to go back to the car analogy.
    Create a base class called Car.
    It should have a few fields that would be appropriate for a generic car class.
    Engine, cylinders, wheels, etc.
    Constructor should initialize cylinders (number of) and name, and set wheels to 4
    and engine to true. Cylinders and names would be passed parameters.

    Create appropriate getters
    Create some methods like startEngine, accelerate, and brake.
    Show a message for each in the base class
    Now create 3 sub classes for your favorite vehicles.
    Override the appropriate methods to demonstrate polymorphism in use.
    Put all the classes in one java file
 */


// Part I
//class Movie {
//    private String name;
//
//    public Movie(String name) {
//        this.name = name;
//    }
//
//    public String plot() {
//        return "No plot here";
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Jaws extends Movie {
//    public Jaws() {
//        super("Jaws");
//    }
//
//    public String plot() {
//        return "A shark eats lots of people.";
//    }
//}
//
//class IndependenceDay extends Movie {
//    public IndependenceDay() {
//        super("Independence Day");
//    }
//
//    @Override
//    public String plot() {
//        return "Aliens attempt to take over planet earth.";
//    }
//}
//
//class MazeRunner extends Movie {
//
//    public MazeRunner() {
//        super("Maze Runner");
//    }
//
//    @Override
//    public String plot() {
//        return "Kids try and escape a maze.";
//    }
//}
//
//class StarWars extends Movie {
//
//    public StarWars() {
//        super("Star Wars");
//    }
//
//    @Override
//    public String plot() {
//        return "Imperial Forces try to take over the universe";
//    }
//}
//
//class Forgettable extends Movie {
//
//    public Forgettable() {
//        super("Forgettable");
//    }
//    // No plot method
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//	    for (int i = 1; i < 11; i++) {
//	        Movie movie = randomMovie();
//            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
//        }
//    }
//
//    public static Movie randomMovie() {
//        int randomNumber = (int) (Math.random() * 5) + 1;
//        System.out.println("Random number generated was: " + randomNumber);
//        switch(randomNumber) {
//            case 1:
//                return new Jaws();
//            case 2:
//                return new IndependenceDay();
//            case 3:
//                return new MazeRunner();
//            case 4:
//                return new StarWars();
//            case 5:
//                return new Forgettable();
//        }
//        return null;
//    }
//
//}
