package com.application.frq.Tanay;

import java.util.ArrayList;

class Car {

    static int lotSize;
    String make;
    String model;
    int age;

    public Car(String make, String model, int age) {
        this.make = make;
        this.model = model;
        this.age = age;
        lotSize++;
    }
    public Car(){}
}
class SportsCar extends Car {

    private int topSpeed;

    public SportsCar(String make, String model, int age, int topSpeed){
        super(make, model, age);
        this.topSpeed = topSpeed;
    }
    public void setTopSpeed(int newSpeed){
        topSpeed = newSpeed;
    }
    public String toString(){
        return("This " + super.make + " " + super.model + " was manufactured in " + super.age + " and has a top speed of " + topSpeed + " mph");
    }
}
class Driver {
    public static void main(String args[]) {

        ArrayList<Car> Cars = new ArrayList<>();

        SportsCar miata = new SportsCar("Mazda", "Miata", 2006, 135);
        Cars.add(miata);
        SportsCar brz = new SportsCar("Subaru", "Brz", 2020, 145);
        Cars.add(brz);
        miata.setTopSpeed(145);

        for(int i=0; i < Cars.size(); i++){
            System.out.println(Cars.get(i));
        }
    }
}