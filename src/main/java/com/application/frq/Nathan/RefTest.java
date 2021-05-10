package com.application.frq.Nathan;

import java.util.ArrayList;

public class RefTest {

    static class Dog{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Dog dm = new Dog();
        dm.setName("little dog");
        System.out.println(dm.getName());

        foo(dm);

        System.out.println(dm.getName());


        ArrayList<Dog> dogs = new ArrayList<>();
        System.out.println(dogs);
        fooList(dogs);
        System.out.println(dogs);

    }

    static void fooList(ArrayList<Dog> d ){
        d.add(new Dog());
    }

    static void foo(Dog d){
        d.setName("monkey");
    }

    static void foo(String s){
        String[] d = new String[0];
    }


}
