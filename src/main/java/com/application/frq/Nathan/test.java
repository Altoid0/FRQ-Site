package com.application.frq.Nathan;

import java.awt.*;

public class test {

    static class Fish{
        public String type = "bone";
        private int a;
         String type(){
            return "fi";
        }
    }

    static class Shark extends Fish{
        public String type = "cart";

         String type(){
            return "sha";
        }
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        int x  = fish.a;
        Fish shark = new Shark();
        Shark shark1 = new Shark();
        System.out.println(fish.type() + " " + shark.type() + " " + shark1.type());
    }
}
