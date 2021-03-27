package com.application.frq.Dhruv;

public class Recursion {
    public static void main (String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial (int n) {
        return n>0 ? n*factorial(n-1) : 1;
    }

    public static int frogsProblem (int steps) { //problem finding the number of ways a frog can hop across a given number of steps if said frog can hop 1 or 2 steps
        if (steps == 1 || steps == 0) 
            return 1;
        return frogsProblem(steps-1) + frogsProblem(steps-2);
    }
}