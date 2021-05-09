package com.application.frq.Nathan;

import java.awt.*;
import java.util.Arrays;

public class test {

    static class Fish{
        public String type = "bone";
        private int a;
         String type(){
            return "fi";
        }
        public Fish(){
             System.out.println("Fish Contstructed");
        }
    }

    static class Shark extends Fish{
        public String type = "cart";

         String type(){
            return "sha";
        }

        public Shark(){
             int d = 3;
             System.out.println("Shark Constructed");
        }

        public Shark(int m){

        }
    }


    /**
     * Changes the array at index 0
     * @param arr the array reference
     */
    static void changeIt(int[] arr){
        arr[0] = -1;
        //arr = new int[5];
    }


    public static void main(String[] args) {
//        Fish fish = new Fish();
//        int x  = fish.a;
            Fish shark = new Shark();
//        Shark shark1 = new Shark();
//        System.out.println(fish.type() + " " + shark.type() + " " + shark1.type());

        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        changeIt(arr);
        System.out.println(Arrays.toString(arr));

    }
}
