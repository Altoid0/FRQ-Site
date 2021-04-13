package com.application.frq.Tanay;

import java.util.ArrayList;

public class Car {

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

class Driver {
    public static void main(String args[]) {

        ArrayList<Car> Cars = new ArrayList<>();

        SportsCar miata = new SportsCar("Mazda", "Miata", 2006, 135);
        Cars.add(miata);
        SportsCar brz = new SportsCar("Subaru", "Brz", 2020, 145);
        Cars.add(brz);
        miata.setTopSpeed(145);
        Truck f150 = new Truck("Ford", "F150", 2017, 350);
        Cars.add(f150);

        for(int i=0; i < Cars.size(); i++){
            System.out.println(Cars.get(i));
        }
        System.out.println("The total amount of cars currently in the lot is " + Car.lotSize);
    }
}