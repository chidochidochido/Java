package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine()");
    }

    public void accelerate() {
        System.out.println("Car -> accelerate()");
    }

    public void brake() {
        System.out.println("Car -> brake()");
    }
}

class Beetle extends Car {
    public Beetle() {
        super("Beetle", 5);
    }

    public void accelerate() {
        System.out.println("Beetle accelerating");
    }
}

class Mini extends Car {
    public Mini() {
        super("Mini", 4);
    }
}

class Jeep extends Car {
    public Jeep() {
        super("Jeep", 4);
    }

    public void accelerate() {
        System.out.println("Accelerating the Jeep");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("default", 0);
        for(int i = 0; i < 10; i++) {
            switch (i%3) {
                case 0:
                    System.out.println("Beetle");
                    myCar = new Beetle();
                    break;

                case 1:
                    System.out.println("Mini");
                    myCar = new Mini();
                    break;

                case 2:
                    System.out.println("Jeep");
                    myCar = new Jeep();
                    break;

                default:
                    System.out.println("Should not enter here");
            }

            myCar.startEngine();
            myCar.accelerate();
            myCar.brake();

        }
    }
}
