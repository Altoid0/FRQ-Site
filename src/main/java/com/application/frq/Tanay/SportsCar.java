package com.application.frq.Tanay;

public class SportsCar extends Car {

    private int topSpeed;

    public SportsCar(String make, String model, int age, int topSpeed) {
        super(make, model, age);
        this.topSpeed = topSpeed;
    }
    public SportsCar() {
    }

    public void setTopSpeed(int newSpeed) {
        topSpeed = newSpeed;
    }

    public String toString() {
        return ("This " + super.make + " " + super.model + " was manufactured in " + super.age + " and has a top speed of " + topSpeed + " mph");
    }
}
