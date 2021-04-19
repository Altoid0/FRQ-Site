package com.application.frq.Nathan;

import java.util.Arrays;

class Car implements Comparable<Car>{
    private int price;
    public Car(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car c) {
        if(c.getPrice() < this.getPrice()){
            return 1;
        }else if(c.getPrice() > this.getPrice()){
            return -1;
        }else{
            return 0;
        }
    }
}

public class MultiSort<T> {

    public <T extends Comparable<T>> T[] insertionSort(T[] arr){

        for(int i=1;i<arr.length; i++){

            int index1 = i;
            int index2 = i-1;
            while (index2 >= 0 && arr[index1].compareTo(arr[index2]) < 0){
                //Swap
                T val1 = arr[index1];
                arr[index1] = arr[index2];
                arr[index2] = val1;

                //decrement
                index1 -= 1;
                index2 -= 1;
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"nathan", "apple", "classroom", "hat", "cat"};
        MultiSort<String> ms = new MultiSort<>();
        System.out.println(Arrays.toString(ms.insertionSort(strings)));

        Car[] cars = new Car[10];
        for(int i=0;i<cars.length;i++){
            cars[i] = new Car((int)(Math.random()*1000));
        }
        MultiSort<Car> cs = new MultiSort<>();
        System.out.println(Arrays.toString(cs.insertionSort(cars)));

    }



}
