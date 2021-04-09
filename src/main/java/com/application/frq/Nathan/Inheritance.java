package com.application.frq.Nathan;

import java.util.ArrayList;
import java.util.Arrays;

public class Inheritance {

    static class Consumable {
        private String action;
        private String name;
        public Consumable(String action, String name){
            this.action = action;
            this.name = name;
        }

        public String consume(){
            return "you just " + action + " " + name;
        }

        //Getter methods for private variables
        public String getName() {
            return name;
        }

        public String getAction() {
            return action;
        }
    }


    static class Food extends Consumable{
        public Food(String foodName){
            super("ate", foodName);
        }

    }

    static class Drink extends Consumable{
        public Drink(String drinkName){
            super("drank", drinkName);
        }

    }

    public static void main(String[] args) {
        ArrayList<Consumable> lunch = new ArrayList<>();

        Food food = new Food("hot dog");
        lunch.add(food);

        Drink drink = new Drink("soda");
        lunch.add(drink);

        lunch.forEach((consumable -> {
            System.out.println(consumable.consume());
        }));

    }


}
